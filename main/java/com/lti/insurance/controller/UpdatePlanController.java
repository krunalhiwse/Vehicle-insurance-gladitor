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

import com.lti.insurance.pojo.UpdatePlanPojo;
import com.lti.insurance.service.UpdatePlanService;


@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class UpdatePlanController {

	@Autowired
	UpdatePlanService pService;
	
	
	
	@GetMapping("/updateplan")
	public List<UpdatePlanPojo> getPlan()
	{
		return pService.updatePlan();
	}
	@PutMapping("/updateplan")
	public boolean addPlan(@RequestBody UpdatePlanPojo planPojo)
	{
		return pService.updatePlan(planPojo);
	}
	
}
