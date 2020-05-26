package com.farmapp.efarm.repository;

import java.util.List;

import com.farmapp.efarm.model.UserDetails;

public interface UserDetailDao {
	
	public void signUpUserDetialsToDb(UserDetails details);
	
	public List<UserDetails> getUserDetails();

}
