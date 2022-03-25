package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.pojo.PlanPojo;
import com.lti.insurance.service.PlanService;



@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class PlanController 
{
	@Autowired
	PlanService pService;
	
	
	
	@GetMapping("/plan")
	public List<PlanPojo> getPlan()
	{
		return pService.getPlan();
	}
	@PostMapping("/plan")
	public boolean addPlan(@RequestBody PlanPojo planPojo)
	{
		return pService.addPlan(planPojo);
	}
	
}
