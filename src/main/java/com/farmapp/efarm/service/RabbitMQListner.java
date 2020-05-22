package com.farmapp.efarm.service;

import java.io.IOException;
import java.util.List;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import com.farmapp.efarm.dto.Employee;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RabbitMQListner implements MessageListener {

	public void onMessage(Message message) {
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Consuming Message - " + new String(message.getBody()));
		List<Employee> listCar =null;
		//List<Employee> participantJsonList = mapper.readValue(new String(message.getBody()), new TypeReference<List<Employee>>(){});
		try {
			 listCar = mapper.readValue(new String(message.getBody()), new TypeReference<List<Employee>>() {
			});
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		for (Employee iterable_element : listCar) {
			System.out.println("empid:"+iterable_element.getEmpId()+" "+"emp name:"+iterable_element.getEmpName());
			
		}

	}

}