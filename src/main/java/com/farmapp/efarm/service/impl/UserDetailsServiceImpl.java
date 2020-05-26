package com.farmapp.efarm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.farmapp.efarm.model.UserDetails;
import com.farmapp.efarm.repository.UserDetailDao;
import com.farmapp.efarm.service.UserDetailsService;


@Service("UserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService{

	
	
	
	@Autowired
	UserDetailDao userDetailDao;
	//define logic
	@Override
	public void createAnUser(UserDetails userDetails) {
		
		
		userDetailDao.signUpUserDetialsToDb(userDetails);
		
		// TODO Auto-generated method stub
		//navigagte db
	}
	@Override
	public List<UserDetails> getUserDetails() {
		// TODO Auto-generated method stub
		
		List<UserDetails> userDetails = userDetailDao.getUserDetails();
		return userDetails;
	}

}
