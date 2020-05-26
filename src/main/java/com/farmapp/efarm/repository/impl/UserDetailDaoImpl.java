package com.farmapp.efarm.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.farmapp.efarm.model.UserDetails;
import com.farmapp.efarm.repository.UserDetailDao;


@Repository("UserDetailDaoImpl")
public class UserDetailDaoImpl implements UserDetailDao {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void signUpUserDetialsToDb(UserDetails details) {
		// TODO Auto-generated method stub
		
		this.jdbcTemplate.update(
		        "insert into person_details (FirstName,LastName,age) values (?,?,?)",
		        details.getFirstName(),details.getLastName(),details.getAge());
		
		
		System.out.println("in db layer"+details.getFirstName());
		
	}
	@Override
	public List<UserDetails> getUserDetails() {
		// TODO Auto-generated method stub
		List<UserDetails> userDetails = this.jdbcTemplate.query(
		        "select FirstName,LastName,Age from person_details",
		        new RowMapper<UserDetails>() {
		            public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
//		            	UserDetails actor = new UserDetails();
//		                actor.setFirstName(rs.getString("first_name"));
//		                actor.setLastName(rs.getString("last_name"));
//		                return actor;
		            	
		            	
		            	UserDetails userDetails=new UserDetails();
		            	userDetails.setFirstName(rs.getString("FirstName"));
		            	userDetails.setLastName(rs.getString("LastName"));
		            	userDetails.setAge(rs.getInt("Age"));
		            	return userDetails;
		            }
		        });
		
		
		return userDetails;
	}


}
