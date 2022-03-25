package com.lti.insurance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.Registration;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO 
{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addRegistration(Registration registration) {
		eMan.persist(registration);
		return true;
	}
	
	@Override
	public List<Registration> getRegistrations() {
		return eMan.createQuery("from Registration").getResultList();
	}

	

}
