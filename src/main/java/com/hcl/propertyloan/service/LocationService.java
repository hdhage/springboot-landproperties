package com.hcl.propertyloan.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.propertyloan.daolayer.AreaDetails;
import com.hcl.propertyloan.daolayer.CustDetails;
import com.hcl.propertyloan.daolayer.CustomerConfirmed;
import com.hcl.propertyloan.daolayer.OfferForCust;
import com.hcl.propertyloan.daolayer.ValidateResult;
import com.hcl.propertyloan.repository.ConfirmCustRepository;
import com.hcl.propertyloan.repository.OfferRepository;
import com.hcl.propertyloan.repository.PropertyRepository;
import com.hcl.propertyloan.validation.ValidateUtil;

@Service
public class LocationService {

	@Autowired
	PropertyRepository propRepository;

	@Autowired
	OfferRepository offerRepository;
	
	@Autowired
	ConfirmCustRepository custConRepository;

	public List<AreaDetails> getLocationWiseRatePerSqFt() {

		List<AreaDetails> areaList = new ArrayList<AreaDetails>();
		areaList = propRepository.findAll();
		System.err.println("@Service "+areaList);
		return areaList;
	}

	public ValidateResult validateNConfirmUser(CustDetails cust){

		ValidateResult result = null;
		try {
			long ratePerSqFt;
			long pinCode = Long.parseLong(cust.getPincode());
			ratePerSqFt = propRepository.findById(pinCode).get().getRatePerSqFt();

			result =  ValidateUtil.validateCustDetails(cust, ratePerSqFt);

			if(result.getResponseCode().equalsIgnoreCase("00000")) {
				
				List<OfferForCust> list = offerRepository.findAll();
				Iterator<OfferForCust> itr = list.iterator();
				while(itr.hasNext()) {
					OfferForCust obj = itr.next();
					if(result.getPropertyVal() > Long.parseLong(obj.getRange())) {
						result.setOfferAvailed(obj.getOfferPercent());
						result.setOfferID(obj.getOfferId());
					}
				}
			}
		}catch (Exception e) {
			System.err.println(e);
		}
		return result;
	}
	
	public String saveConfirmCust(CustomerConfirmed custConfirm) {
		custConRepository.save(custConfirm);
		String salary = custConfirm.getSalary();
		String propVal = custConfirm.getPropertyVal();
		double perce = Integer.parseInt(custConfirm.getOfferAvailed());
		
		double finalValue = Double.parseDouble(propVal) * (perce/ 100);
		double emiAmount = (int) (Double.parseDouble(salary) * 0.5);
		double tenure = (finalValue/emiAmount)/12;
		
		
		return "Loan Amount :: "+String.valueOf(finalValue)+" EMI Amount :: "+String.valueOf(emiAmount)+" Time To Pay in yrs :: "+String.valueOf(tenure);
	}

}
