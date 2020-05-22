package com.farmapp.efarm.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farmapp.efarm.dto.PersonalDetails;

@RestController

@RequestMapping("api")
public class CrudOperationsController {
	
	
	@RequestMapping(value = "/createAccount",method = RequestMethod.POST)
	public void singUpAccount(@RequestBody PersonalDetails personalDetails) {
		
		
		System.out.println("UserName"+personalDetails.getFirstName()+personalDetails.getLastName());
	}

}
