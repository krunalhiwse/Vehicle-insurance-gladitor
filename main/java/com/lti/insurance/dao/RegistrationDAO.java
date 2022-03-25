package com.lti.insurance.dao;

import java.util.List;
import com.lti.insurance.pojo.Registration;

public interface RegistrationDAO 
{
	public boolean addRegistration(Registration registration);
	public List<Registration> getRegistrations();
}
