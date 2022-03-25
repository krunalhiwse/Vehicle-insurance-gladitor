package com.lti.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.dao.LoginDAO;
import com.lti.insurance.pojo.LoginPojo;
import com.lti.insurance.dao.LoginDAO;

@Service
public class LoginSeriveImpl implements LoginService 
{
	@Autowired
	LoginDAO logindao;

	@Override
	public void addUser(LoginPojo login) 
	{
		logindao.save(login);
	}

	@Override
	public LoginPojo getUserByEmail(String Email) 
	{
		
		return logindao.findById(Email).orElse(null);
	}
	
}
