package Project.DTOs;

public class Retailer {
	
	//Retailer attributes
	private String retailName = null;
	private String contactNumber = null;
	
	
	public String getRetailName() {
		return retailName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	
	@Override
	public String toString() {
		return "Retailer [retailName=" + retailName + ", contactNumber=" + contactNumber
				+ "]";
	}
	
	
	

}
