package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.insurance.pojo.Contactpojo;
import com.lti.insurance.service.ContactService;
import com.lti.insurance.service.ContactServiceImpl;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class ContactController 
{
	@Autowired
	ContactService cservice;
	
	
	
	@GetMapping("/contact")
	public List<Contactpojo> getContacts()
	{
		return cservice.getContacts();
	}
	@PostMapping("/contact")
	public boolean addConatct(@RequestBody Contactpojo contact)
	{
		return cservice.addContact(contact);
	}
}
