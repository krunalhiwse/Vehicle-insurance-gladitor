package com.lti.insurance.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.insurance.pojo.Contactpojo;



public interface ContactDAO 
{
	public boolean addContact(Contactpojo contact);
	public List<Contactpojo> getContacts();
}
