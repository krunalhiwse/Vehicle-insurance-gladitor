package com.lti.insurance.dao;

import java.util.List;

import com.lti.insurance.pojo.Claim;

public interface ClaimDao 
{
	public Claim addorupdateClaim(Claim claim);
	public Claim findvclaimbyclaimid(int claimid);
	public List<Claim> viewAllPendingClaims(String approvalStatus);
	public List<Claim> findClaimbyCustomerId(int customerId);
	

}
