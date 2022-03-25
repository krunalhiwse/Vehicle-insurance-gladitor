package com.lti.insurance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.Contactpojo;

@Repository
public class ContactDAOImpl implements ContactDAO
{
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addContact(Contactpojo contact) {
		eMan.persist(contact);
		return true;
	}

	@Override
	public List<Contactpojo> getContacts() {
		return eMan.createQuery("from Contactpojo").getResultList();
	}

}
