package com.hcl.propertyloan.daolayer;

public class ValidateResult {
	
	private String responseCode;
	private String responseText;
	private String status;
	private long propertyVal;
	private String offerAvailed;
	private int offerID;
	
	public int getOfferID() {
		return offerID;
	}
	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}
	public String getOfferAvailed() {
		return offerAvailed;
	}
	public void setOfferAvailed(String offerAvailed) {
		this.offerAvailed = offerAvailed;
	}
	public long getPropertyVal() {
		return propertyVal;
	}
	public void setPropertyVal(long propertyVal) {
		this.propertyVal = propertyVal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseText() {
		return responseText;
	}
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

}
