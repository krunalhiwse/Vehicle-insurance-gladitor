package com.lti.insurance.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.insurance.dao.ClaimDaoImp;
import com.lti.insurance.pojo.Claim;



@Service
@Transactional
public class ClaimService 
{
	
	@Autowired
	ClaimDaoImp dao;
	
	public Claim addorupdateClaim(Claim claim) {
		return dao.addorupdateClaim(claim);
	}
	
	public Claim findvclaimbyclaimid(int claimid) {
		return dao.findvclaimbyclaimid(claimid);
	}
	
	public List<Claim> viewAllPendingClaims(String approvalStatus){
		return dao.viewAllPendingClaims(approvalStatus);
	}
}
