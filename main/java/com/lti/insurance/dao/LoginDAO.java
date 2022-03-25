package com.lti.insurance.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.LoginPojo;

@Repository
public interface LoginDAO extends CrudRepository<LoginPojo,String> 
{
	
}
