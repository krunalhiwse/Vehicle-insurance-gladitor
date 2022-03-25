package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.dao.PlanDAO;
import com.lti.insurance.pojo.Contactpojo;
import com.lti.insurance.pojo.PlanPojo;

@Service
@Transactional
public class PlanServiceImpl  implements PlanService
{
	@Autowired
	PlanDAO pdao;
	
	@Override
	public boolean addPlan(PlanPojo planPojo) {
		return pdao.addPlan(planPojo);
	}

	@Override
	public List<PlanPojo> getPlan() {
		
		return pdao.getPlan() ;
	}
	
}
