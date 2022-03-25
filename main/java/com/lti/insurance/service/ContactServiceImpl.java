package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.dao.ContactDAO;
import com.lti.insurance.pojo.Contactpojo;

@Service
@Transactional
public class ContactServiceImpl implements ContactService
{

	@Autowired
	ContactDAO cdao;
	
	@Override
	public boolean addContact(Contactpojo contact) {
		return cdao.addContact(contact);
	}

	@Override
	public List<Contactpojo> getContacts() {
		
		return cdao.getContacts() ;
	}

}
