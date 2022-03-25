package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.pojo.ClaimPojo;
import com.lti.insurance.pojo.Contactpojo;
import com.lti.insurance.service.ClaimServicee;
import com.lti.insurance.service.ContactService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class ClaimControllerr 
{
	@Autowired
	ClaimServicee cls;
	
	
	
	@GetMapping("/claim")
	public List<ClaimPojo> getclaim()
	{
		return cls.getclaim();
	}
	@PostMapping("/claim")
	public boolean addConatct(@RequestBody ClaimPojo claim)
	{
		return cls.addclaim(claim);
	}
}
