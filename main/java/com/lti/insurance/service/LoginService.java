package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.dao.LoginDAO;
import com.lti.insurance.pojo.LoginPojo;

public interface LoginService
{
	public void addUser(LoginPojo login);
	
	public LoginPojo getUserByEmail(String Email);
}
