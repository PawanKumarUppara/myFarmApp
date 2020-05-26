package com.farmapp.efarm.service;

import java.util.List;

import com.farmapp.efarm.model.UserDetails;

public interface UserDetailsService {
	
	
	public void createAnUser(UserDetails userDetails);
	
	public List<UserDetails> getUserDetails();

}
