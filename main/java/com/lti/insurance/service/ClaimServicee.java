package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.pojo.ClaimPojo;


public interface ClaimServicee 
{
	public boolean addclaim(ClaimPojo claim);
	public List<ClaimPojo> getclaim();
}
