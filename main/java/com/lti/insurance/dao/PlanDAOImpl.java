package com.lti.insurance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.lti.insurance.pojo.PlanPojo;

@Repository
public class PlanDAOImpl  implements PlanDAO
{
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addPlan(PlanPojo planPojo) {
		eMan.merge(planPojo);
		return true;
	}

	@Override
	public List<PlanPojo> getPlan() {
		return eMan.createQuery("from PlanPojo").getResultList();
	}

}
