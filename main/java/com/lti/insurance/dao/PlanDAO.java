package com.lti.insurance.dao;

import java.util.List;


import com.lti.insurance.pojo.PlanPojo;

public interface PlanDAO
{
	public boolean addPlan(PlanPojo planPojo);
	public List<PlanPojo> getPlan();
}
