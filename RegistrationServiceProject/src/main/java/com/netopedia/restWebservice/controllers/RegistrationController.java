package com.netopedia.restWebservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netopedia.restWebservice.ServiceInterface.RegService;
import com.netopedia.restWebservice.model.User;

@RestController
public class RegistrationController {
	
	@Autowired
	RegService regService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public User getUserById(@PathVariable("id") long id) {
		return regService.getRegUserById(id);
	}
}
