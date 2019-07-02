package Project.DTOs;

public class Barcode {
	
	private String barcodeNumber = null;

	public String getBarcodeNumber() {
		return barcodeNumber;
	}
	
	

	public void setBarcodeNumber(String barcodeNumber) {
		this.barcodeNumber = barcodeNumber;
	}


	@Override
	public String toString() {
		return "Barcode [barcodeNumber=" + barcodeNumber + "]";
	}
	
	
	

}
