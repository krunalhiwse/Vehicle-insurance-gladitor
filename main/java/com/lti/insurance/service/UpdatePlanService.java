package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.pojo.PlanPojo;
import com.lti.insurance.pojo.UpdatePlanPojo;

public interface UpdatePlanService 
{
	public boolean updatePlan(UpdatePlanPojo updatePlanPojo);
	public List<UpdatePlanPojo> updatePlan();
}
