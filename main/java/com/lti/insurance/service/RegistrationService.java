package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.pojo.Registration;

public interface RegistrationService 
{
	public boolean addRegistration(Registration registration);
	public List<Registration> getRegistrations();
}
