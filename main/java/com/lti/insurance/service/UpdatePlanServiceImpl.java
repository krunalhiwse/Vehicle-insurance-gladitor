package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.dao.UpdatePlanDAO;
import com.lti.insurance.pojo.UpdatePlanPojo;

@Repository
@Transactional
public class UpdatePlanServiceImpl implements UpdatePlanService 
{
	@Autowired
	UpdatePlanDAO updao;

	@Override
	public boolean updatePlan(UpdatePlanPojo updatePlanPojo) {
		return updao.updateplan(updatePlanPojo);
	
	}

	@Override
	public List<UpdatePlanPojo> updatePlan() {
		return updao.updatePlan();
	}

}
