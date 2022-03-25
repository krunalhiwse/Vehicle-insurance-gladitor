package com.lti.insurance.dao;

import java.util.List;


import com.lti.insurance.pojo.UpdatePlanPojo;

public interface UpdatePlanDAO 
{
	public boolean updateplan(UpdatePlanPojo planPojo);
	public List<UpdatePlanPojo> updatePlan();
}
