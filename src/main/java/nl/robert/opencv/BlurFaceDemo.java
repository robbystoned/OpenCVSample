package nl.robert.opencv;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class BlurFaceDemo {
	private CascadeClassifier faceDetector = new CascadeClassifier(getClass().getResource("/lbpcascade_frontalface.xml").getPath().substring(1));
	
	
	public Mat run(Mat image) {
		System.out.println("\nRunning DetectFaceDemo");
		// Create a face detector from the cascade file in the resources
		// Detect faces in the image.
		// MatOfRect is a special container clashttps://github.com/robbystoned/OpenCVSamples for Rect.
		MatOfRect faceDetections = new MatOfRect();
		faceDetector.detectMultiScale(image, faceDetections);
		System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));	
		// Draw a bounding box around each face.
		
		for (Rect rect : faceDetections.toArray()) {
			//Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
			//		new Scalar(0, 255, 0));
			
			Mat mask = image.submat(rect);
			Imgproc.blur(mask, mask, new Size(55, 55));			
		}
		return image;
	}
}