package com.netopedia.restWebservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netopedia.restWebservice.ServiceInterface.RegService;
import com.netopedia.restWebservice.model.ApiSuccess;
import com.netopedia.restWebservice.model.User;

@RestController
public class RegistrationController {
	
	@Autowired
	RegService regService;
	
	Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public User getUserById(@PathVariable("id") long id) {
		logger.trace("getUserById method called");
		return regService.getRegUserById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customer/post/{id}")
	public ResponseEntity<ApiSuccess> createCustomer(@RequestBody User user) {
		String result = regService.createUserById(user);
		return new ResponseEntity<ApiSuccess>(new ApiSuccess("Customer successfully registered"),HttpStatus.CREATED);
	}
}
