package com.hcl.propertyloan.daolayer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_confirm_tbl")
public class CustomerConfirmed {

	@Id
	private String email;
	private String name;
	private String dob;
	private String gender;
	private String salary;
	private String panNo;
	private String pincode;
	private String areaSize;
	private String propertyVal;
	private String offerAvailed;
	private String offerID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(String areaSize) {
		this.areaSize = areaSize;
	}
	public String getPropertyVal() {
		return propertyVal;
	}
	public void setPropertyVal(String propertyVal) {
		this.propertyVal = propertyVal;
	}
	public String getOfferAvailed() {
		return offerAvailed;
	}
	public void setOfferAvailed(String offerAvailed) {
		this.offerAvailed = offerAvailed;
	}
	public String getOfferID() {
		return offerID;
	}
	public void setOfferID(String offerID) {
		this.offerID = offerID;
	}
	
}
