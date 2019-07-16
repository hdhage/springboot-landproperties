package com.hcl.propertyloan.daolayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="area_detail_tbl")
public class AreaDetails {
	
	@Id
	@Column(name="pin_code")
	private long pinCode;
	
	@Column(name="rate_per_sqft")
	private long ratePerSqFt;

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public long getRatePerSqFt() {
		return ratePerSqFt;
	}

	public void setRatePerSqFt(long ratePerSqFt) {
		this.ratePerSqFt = ratePerSqFt;
	}

	@Override
	public String toString() {
		return "AreaDetails [pinCode=" + pinCode + ", ratePerSqFt=" + ratePerSqFt + "]";
	}
	

}
