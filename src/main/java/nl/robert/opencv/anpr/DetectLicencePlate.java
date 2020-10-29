package nl.robert.opencv.anpr;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfDouble;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import nl.robert.opencv.rwd.RDWRest;

public class DetectLicencePlate {
	private CascadeClassifier faceDetector = new CascadeClassifier(getClass().getResource("/eu.xml").getPath().substring(1));
	private Tesseract tesseract1 = new Tesseract();
	private LicencePlateValidator validator = new LicencePlateValidator();
	public DetectLicencePlate() {
		tesseract1.setTessVariable("user_defined_dpi", "600");
		tesseract1.setTessVariable("tessedit_char_whitelist", "BCDFGHJKLMNPQRSTVWXYZ0123456789-");
		//tesseract1.setTessVariable("language_model_penalty_non_freq_dict_word", "1");
		//tesseract1.setTessVariable("language_model_penalty_non_dict_word ", "1");
		//tesseract1.setTessVariable("load_system_dawg", "0");
		//tesseract1.setPageSegMode(1);
		tesseract1.setOcrEngineMode(3);
		tesseract1.setLanguage("eng");
		tesseract1.setDatapath("./tessdata");
		 System.out.println("Working Directory = " + System.getProperty("user.dir"));
	}
	public LicencePlate run(Mat image) throws TesseractException, Exception {
		Mat greyImage = new Mat();
		
		Imgproc.cvtColor(image, greyImage, Imgproc.COLOR_BGR2GRAY);
		MatOfRect faceDetections = new MatOfRect();
		Size msize = new Size(0,0);
		//faceDetector.detectMultiScale(greyImage, faceDetections,1.1,3, 0, msize, msize);
		MatOfInt rejectLevels = new MatOfInt();
		MatOfDouble levelWeights = new MatOfDouble();
		faceDetector.detectMultiScale3(greyImage, faceDetections, rejectLevels, levelWeights, 1.1, 3, 0, msize, msize, true);
		//System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
		// Draw a bounding box around each face.
		Mat licence = null;
		LicencePlate licencePlate = new LicencePlate();
		licencePlate.setImage(image);

		double[] weights;
		
		if (!levelWeights.empty()) {
			weights = levelWeights.toArray();
			System.out.println("Weight: " + weights[0]);
		}
		
		int i=0;
		for (Rect rect : faceDetections.toArray()) {
			Imgproc.rectangle(greyImage, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
			licence = greyImage.submat(rect);
			//System.out.println("confidence: " + weights[i]);
			Imgproc.threshold(licence, licence, 0, 255, Imgproc.THRESH_OTSU);
			String licencePlateText = tesseract1.doOCR(Mat2BufferedImage(licence));
			licencePlate.addCroppedImage(licence);
			licencePlate.setRawLicencePlate(licencePlateText);
			
			validator.validateLicensePlate(licencePlate);
			i++;
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
	
}