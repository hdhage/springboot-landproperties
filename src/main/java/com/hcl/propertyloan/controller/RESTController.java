package com.hcl.propertyloan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.propertyloan.daolayer.AreaDetails;
import com.hcl.propertyloan.daolayer.CustDetails;
import com.hcl.propertyloan.daolayer.CustomerConfirmed;
import com.hcl.propertyloan.daolayer.ValidateResult;
import com.hcl.propertyloan.service.LocationService;

@RestController
@RequestMapping("/propertyinfo")
public class RESTController {
	
	@Autowired
	LocationService locationService;

	@Autowired
	
	@GetMapping("/getDetails")
	public List<AreaDetails> getPropertyAreas() {
		List<AreaDetails> areaList = new ArrayList<AreaDetails>();
		areaList = locationService.getLocationWiseRatePerSqFt();
		System.err.println("@Controller "+areaList);
		return areaList;
	}
	
	@PostMapping("/register")
	public ValidateResult registerCustomer(@RequestBody CustDetails cust) {
		System.out.println(cust);
		ValidateResult result = locationService.validateNConfirmUser(cust);
		return result;
	}
	
	@PostMapping("/confirm")
	public String  confirmCustomer(@RequestBody CustomerConfirmed custConfirmed) {
		String result = locationService.saveConfirmCust(custConfirmed);
		return result;
	}
	
	
}
