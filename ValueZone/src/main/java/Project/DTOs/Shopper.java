
package Project.DTOs;

public class Shopper {
	
	//Shopper attributes
	private String name = null;
	private String surname = null;
	private String emailAddress = null;
	private String contactNumber = null;
	private String physicalAdd = null;
	

	public Shopper(String email, String name2, String surname2, String contactNum, String physicalAdd2) {
		this.name = name2;
		this.emailAddress = email;
		this.surname = surname2;
		this.contactNumber = contactNum;
		this.physicalAdd = physicalAdd2;
	}

	public String getPhysicalAdd() {
		return physicalAdd;
	}

	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}

	@Override
	public String toString() {
		return "Shopper [name=" + name + ", surname=" + surname + ", emailAddress=" + emailAddress + ", contactNumber="
				+ contactNumber + ", physicalAdd=" + physicalAdd + "]";
	}
	

	
	
	
	
	
}
