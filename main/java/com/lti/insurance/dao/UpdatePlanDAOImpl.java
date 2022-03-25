package com.lti.insurance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.UpdatePlanPojo;

@Repository
public class UpdatePlanDAOImpl implements UpdatePlanDAO
{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean updateplan(UpdatePlanPojo planPojo) {
		eMan.merge(planPojo);
		return true;
	}

	@Override
	public List<UpdatePlanPojo> updatePlan() {
		return eMan.createQuery("from UpdatePlanPojo").getResultList();
	}
	
}
