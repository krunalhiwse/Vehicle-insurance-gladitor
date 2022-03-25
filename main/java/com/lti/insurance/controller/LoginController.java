package com.lti.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.pojo.LoginPojo;
import com.lti.insurance.service.LoginService;

@RestController
@RequestMapping(value = "/rest/api")
@CrossOrigin("http://localhost:4200")
public class LoginController 
{
	@Autowired
	LoginService loginservice;
	
	@PostMapping(value = "/login")
	public boolean isAuthinticate(@RequestBody LoginPojo userdetail)
	{
		LoginPojo dbUserDetail = loginservice.getUserByEmail(userdetail.getEmail());
		if(dbUserDetail!=null)
		{
			if(dbUserDetail.getPassword().equals(userdetail.getPassword()))
			{
				return true;
			}
		}
		return false;
	}
}
