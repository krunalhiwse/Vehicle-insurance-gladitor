package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.pojo.LoginPojo;
import com.lti.insurance.pojo.Registration;
import com.lti.insurance.service.LoginService;
import com.lti.insurance.service.RegistrationService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class RegistrationController 
{
	@Autowired
	RegistrationService rservice;
	
	@Autowired
	LoginService loginservice;
	
	@GetMapping("/registration")
	public List<Registration> getRegistrations()
	{
		return rservice.getRegistrations();
	}
	@PostMapping("/registration")
	public boolean addRegistartion(@RequestBody Registration registration)
	{
		LoginPojo user = new LoginPojo();
		user.setEmail(registration.getEmail());
		user.setPassword(registration.getPassword());
		loginservice.addUser(user);
		
		return rservice.addRegistration(registration);
	}
		
	}

