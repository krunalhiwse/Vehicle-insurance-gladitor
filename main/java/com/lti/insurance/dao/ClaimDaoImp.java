package com.lti.insurance.dao;



import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.Claim;



@Repository
public class ClaimDaoImp implements ClaimDao
{

	@Autowired
	EntityManager eMan;

	@Override
	public Claim addorupdateClaim(Claim claim) 
	{
	
			Claim clm=eMan.merge(claim);
			return clm;
		
	}

	@Override
	public Claim findvclaimbyclaimid(int claimid) {
	
			return eMan.find(Claim.class, claimid);
		
	}

	@Override
	public List<Claim> viewAllPendingClaims(String approvalStatus) {
	
			String qry="select clm from Claim clm where clm.approvalStatus=:p";
			//TypedQuery<Claim> qry1=eMan.createQuery(qry,Claim.class);
			Query query=eMan.createQuery(qry);
			query.setParameter("p", approvalStatus);
			return query.getResultList();
		
	}

	@Override
	public List<Claim> findClaimbyCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

