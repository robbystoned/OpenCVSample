package nl.robert.opencv;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import nl.robert.opencv.model.LicencePlate;

public class DetectLicencePlate {
	private CascadeClassifier faceDetector = new CascadeClassifier(getClass().getResource("/cascade.xml").getPath().substring(1));
	private Tesseract tesseract1 = new Tesseract();
	
	public DetectLicencePlate() {
		tesseract1.setTessVariable("user_defined_dpi", "600");
		//tesseract1.setTessVariable("tessedit_char_whitelist", "BCDFGHJKLMNPQRSTVWXYZ0123456789-");
		//tesseract1.setTessVariable("language_model_penalty_non_freq_dict_word", "1");
		//tesseract1.setTessVariable("language_model_penalty_non_dict_word ", "1");
		//tesseract1.setTessVariable("load_system_dawg", "0");
		tesseract1.setLanguage("leu");
		tesseract1.setDatapath("C:\\langdata-master");
	}
	public LicencePlate run(Mat image) throws TesseractException, Exception {
		//System.out.println("\nRunning DetectFaceDemo");
		// Create a face detector from the cascade file in the resources
		// Detect faces in the image.
		// MatOfRect is a special container class for Rect.
		MatOfRect faceDetections = new MatOfRect();
		faceDetector.detectMultiScale(image, faceDetections);
		//System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
		// Draw a bounding box around each face.
		Mat licence = null;

		LicencePlate licencePlate = new LicencePlate();
	
		for (Rect rect : faceDetections.toArray()) {
			Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
					new Scalar(0, 255, 0));
			licence = image.submat(rect);
			String licencePlateText = tesseract1.doOCR(Mat2BufferedImage(licence));
			licencePlate.setImage(licence);
			isDutchLicencePlate(licencePlateText, licencePlate);
		}
		
		if(licencePlate.getImage() == null) {
			licencePlate.setImage(image);
		}
			
		return licencePlate;
	}
	
	private BufferedImage Mat2BufferedImage(Mat matrix) throws Exception {
	    MatOfByte mob = new MatOfByte();
	    Imgcodecs.imencode(".jpg", matrix, mob);
	    byte ba[] = mob.toArray();

	    BufferedImage bi = ImageIO.read(new ByteArrayInputStream(ba));
	    return bi;
	}
	
	public void isDutchLicencePlate(String input, LicencePlate licencePlate) {
		System.out.println("input: " + input);
		String regex = "(([a-zA-Z]{3}[0-9]{3})|(\\w{2}-\\w{2}-\\w{2})|([0-9]{2}-[a-zA-Z]{3}-[0-9]{1})|([0-9]{1}-[a-zA-Z]{3}-[0-9]{2})|([a-zA-Z]{1}-[0-9]{3}-[a-zA-Z]{2}))";
		 Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		 Matcher matcher = pattern.matcher(input);
		 licencePlate.setDutchLicencePlate(matcher.find());
		 if(licencePlate.isDutchLicencePlate()) {
			 licencePlate.setNormalizedLicencePlate(matcher.group());
		 }
		
	}	
}