package com.hcl.propertyloan.validation;

import java.util.Calendar;

import com.hcl.propertyloan.daolayer.CustDetails;
import com.hcl.propertyloan.daolayer.ValidateResult;

public class ValidateUtil {
	
	
	public static ValidateResult validateCustDetails(CustDetails cust, Long ratePerSqFt) {
		
		ValidateResult result = new ValidateResult();
		
		String selectedPinCode = cust.getPincode(); 
		String selectedAreaSize = cust.getAreaSize(); 
		String dob = cust.getDob();
		
		int salary = Integer.parseInt(cust.getSalary());
		Calendar calOne = Calendar.getInstance();
		int age = calOne.get(Calendar.YEAR) - Integer.parseInt(dob.substring(dob.lastIndexOf("-")));
		Long propertyVal =  ratePerSqFt * Long.parseLong(selectedAreaSize);
		
		System.err.println();
		
		String salStatus = salary < 10000 ? "Invalid" : "Valid";
		String ageStatus = age < 25 ? "Invalid" : "Valid";
		String propValStatus = propertyVal < 5_00_000 ? "Invalid" : "Valid";
		
		if(ageStatus.equalsIgnoreCase("Invalid")) {
			result.setResponseCode("11111");
			result.setResponseText("Invalid Age");
			result.setStatus("Loan NOT Processed");
		}else if(salStatus.equalsIgnoreCase("Invalid")) {
			result.setResponseCode("22222");
			result.setResponseText("Invalid Salary");
			result.setStatus("Loan NOT Processed");
		}else if(propValStatus.equalsIgnoreCase("Invalid")) {
			result.setResponseCode("33333");
			result.setResponseText("Invalid Property Value");
			result.setStatus("Loan NOT Processed");
		}else {
			result.setResponseCode("00000");
			result.setResponseText("Valid Parameters");
			result.setStatus("Loan Could proccess");
			result.setPropertyVal(propertyVal);
		}

		return result;
	}

}
