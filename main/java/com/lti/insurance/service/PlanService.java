package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.pojo.PlanPojo;

public interface PlanService 
{
	public boolean addPlan(PlanPojo planPojo);
	public List<PlanPojo> getPlan();
}
