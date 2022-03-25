package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.dao.ClaimDA;
import com.lti.insurance.pojo.ClaimPojo;

@Repository
@Transactional
public class CliamServiceeImpl implements ClaimServicee 
{

	@Autowired
	ClaimDA cdao;
	@Override
	public boolean addclaim(ClaimPojo claim) {
		return cdao.addclaim(claim);
	}

	@Override
	public List<ClaimPojo> getclaim() {
		return cdao.getclaim() ;
	}

}
