package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.pojo.Contactpojo;


public interface ContactService
{
	public boolean addContact(Contactpojo contact);
	public List<Contactpojo> getContacts();
}
