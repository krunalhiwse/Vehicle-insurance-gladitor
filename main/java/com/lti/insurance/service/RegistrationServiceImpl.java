package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.dao.RegistrationDAO;
import com.lti.insurance.pojo.Registration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService 
{		
	@Autowired
	RegistrationDAO rdao;

	@Override
	public boolean addRegistration(Registration registration) {
		
		return rdao.addRegistration(registration);
	}

	@Override
	public List<Registration> getRegistrations() {
		return rdao.getRegistrations();
	}

	
	
}
