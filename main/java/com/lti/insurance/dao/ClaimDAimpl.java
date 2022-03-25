package com.lti.insurance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.ClaimPojo;

@Repository
public class ClaimDAimpl implements ClaimDA 
{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addclaim(ClaimPojo claim) {
		 eMan.persist(claim);
		 return true;
	}

	@Override
	public List<ClaimPojo> getclaim() {
		return eMan.createQuery("from ClaimPojo").getResultList();
	}

}
