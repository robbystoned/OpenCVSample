package nl.robert.opencv.model;

import org.opencv.core.Mat;

public class LicencePlate {
	private boolean isDutchLicencePlate;
	private String normalizedLicencePlate;
	private Mat image;

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
