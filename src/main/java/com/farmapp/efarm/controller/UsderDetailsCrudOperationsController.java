package com.farmapp.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farmapp.efarm.model.UserDetails;
import com.farmapp.efarm.service.UserDetailsService;
import com.farmapp.efarm.service.impl.UserDetailsServiceImpl;

@RestController//liason that receives data for some kind of api
@RequestMapping("api/userDetails")
public class UsderDetailsCrudOperationsController {
	
	
	//insert
	
	@Autowired//inject
	UserDetailsService userDetailsService;
	@RequestMapping(value = "/createFacebookAccount",method = RequestMethod.POST)
	public void singUpToFaceBookAccount( @RequestBody UserDetails userDetails) {
		
		userDetailsService.createAnUser(userDetails);
		
	}
	
	@RequestMapping(value = "/retriveUsers",method = RequestMethod.GET)
	public List<UserDetails> retriveUserDetails(){
		
		List<UserDetails> userDetails = userDetailsService.getUserDetails();
		
		for(UserDetails details:userDetails) {
			System.out.println(details.getFirstName());
		}
		
		return userDetails;
		
		
	}

}
