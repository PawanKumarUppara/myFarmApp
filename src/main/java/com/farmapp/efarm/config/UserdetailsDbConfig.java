package com.farmapp.efarm.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import ch.qos.logback.core.db.DriverManagerConnectionSource;

@Configuration
public class UserdetailsDbConfig {
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://database-1.cx0yz4d3qxdd.us-east-1.rds.amazonaws.com/admin");
		dataSource.setUsername("admin");
		dataSource.setPassword("rootroot");
		
		return dataSource;
		
	}

	
	//jdbc templa
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}
}
