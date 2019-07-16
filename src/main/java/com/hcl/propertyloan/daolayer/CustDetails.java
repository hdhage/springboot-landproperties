package com.hcl.propertyloan.daolayer;

public class CustDetails {

	private String name;
	private String dob;
	private String gender;
	private String email;
	private String salary;
	private String panNo;
	private String pinCode;
	private String areaSize;
	
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
		return pinCode;
	}
	public void setPincode(String pincode) {
		this.pinCode = pincode;
	}
	public String getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(String areaSize) {
		this.areaSize = areaSize;
	}
	
	@Override
	public String toString() {
		return "CustDetails [name=" + name + ", dob=" + dob + ", gender=" + gender + ", email=" + email + ", salary="
				+ salary + ", panNo=" + panNo + ", pincode=" + pinCode + ", areaSize=" + areaSize + "]";
	}

}
