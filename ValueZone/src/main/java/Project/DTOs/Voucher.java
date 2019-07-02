package Project.DTOs;

import java.util.Date;

public class Voucher {
	
	//Voucher attributes
	private Barcode barcode = null;
	private String retailer = null;
	private Date validfrom = null;
	private Date expiryDate= null;
	private String downloadedBy = null;
	private boolean redeemed = false;
	private String details = null;
	private String tcs = null;
	public Barcode getBarcode() {
		return barcode;
	}
	public String getRetailer() {
		return retailer;
	}
	public Date getValidfrom() {
		return validfrom;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public String getDownloadedBy() {
		return downloadedBy;
	}
	public boolean isRedeemed() {
		return redeemed;
	}
	public String getDetails() {
		return details;
	}
	public String getTcs() {
		return tcs;
	}
	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public void setDownloadedBy(String downloadedBy) {
		this.downloadedBy = downloadedBy;
	}
	public void setRedeemed(boolean redeemed) {
		this.redeemed = redeemed;
	}
	public void setTcs(String tcs) {
		this.tcs = tcs;
	}
	@Override
	public String toString() {
		return "Voucher [barcode=" + barcode + ", retailer=" + retailer + ", validfrom=" + validfrom + ", expiryDate="
				+ expiryDate + ", downloadedBy=" + downloadedBy + ", redeemed=" + redeemed + ", details=" + details
				+ ", tcs=" + tcs + "]";
	}
	
	
	

}
