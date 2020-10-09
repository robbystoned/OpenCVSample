package nl.robert.opencv;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;

public class LicencePlate {
	private boolean isDutchLicencePlate;
	private String normalizedLicencePlate;
	private String carDetail;
	
	public String getCarDetail() {
		return carDetail;
	}

	public void setCarDetail(String carDetail) {
		this.carDetail = carDetail;
	}

	private Mat image;
	private List<Mat> croppedImage = new ArrayList<>();

	
	public List<Mat> getCroppedImage() {
		return croppedImage;
	}

	public void addCroppedImage(Mat croppedImage) {
		this.croppedImage.add(croppedImage);
	}

	public Mat getImage() {
		return image;
	}

	public void setImage(Mat image) {
		this.image = image;
	}

	public boolean isDutchLicencePlate() {
		return isDutchLicencePlate;
	}

	public void setDutchLicencePlate(boolean isDutchLicencePlate) {
		this.isDutchLicencePlate = isDutchLicencePlate;
	}

	public String getNormalizedLicencePlate() {
		return normalizedLicencePlate;
	}

	public void setNormalizedLicencePlate(String normalizedLicencePlate) {
		this.normalizedLicencePlate = normalizedLicencePlate;
	}
}
