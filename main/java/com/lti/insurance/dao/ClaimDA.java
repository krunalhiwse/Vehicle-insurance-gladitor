package com.lti.insurance.dao;

import java.util.List;

import com.lti.insurance.pojo.ClaimPojo;



public interface ClaimDA 
{
	public boolean addclaim(ClaimPojo claim);
	public List<ClaimPojo> getclaim();
}
