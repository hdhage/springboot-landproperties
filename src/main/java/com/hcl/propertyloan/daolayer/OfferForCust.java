package com.hcl.propertyloan.daolayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property_offer_tbl")
public class OfferForCust {

	@Id
	@Column(name="offer_code")
	private int offerId;
	
	@Column(name="range")
	private String range;
	
	@Column(name="offer_percent")
	private String offerPercent;

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getOfferPercent() {
		return offerPercent;
	}

	public void setOfferPercent(String offerPercent) {
		this.offerPercent = offerPercent;
	}

	@Override
	public String toString() {
		return "OfferForCust [offerId=" + offerId + ", range=" + range + ", offerPercent=" + offerPercent + "]";
	}
	
}
