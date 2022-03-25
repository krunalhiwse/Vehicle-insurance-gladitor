package com.lti.insurance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class Registration 
{
	
	@Column(name="cust_name")
	private String Name;
	@Id
	private String Email;
	@Column(name="Date_of_Birth")
	private String Dob;
	@Column(name="Contact_number")
	private String ConNumber;
	private String Address;
	private String Password;
	@Column(name="Confirm_Password")
	private String ConPassword;
//	@Column(name="UserName")
//	private String Username;
	
	
	public Registration(String name, String email, String dob, String conNumber, String address, String password,
			String conPassword, String username) {
		super();
		Name = name;
		Email = email;
		Dob = dob;
		ConNumber = conNumber;
		Address = address;
		Password = password;
		ConPassword = conPassword;
	
	}

	@Override
	public String toString() {
		return "Registration [Name=" + Name + ", Email=" + Email + ", Dob=" + Dob + ", ConNumber=" + ConNumber
				+ ", Address=" + Address + ", Password=" + Password + ", ConPassword=" + ConPassword + "]";
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getConNumber() {
		return ConNumber;
	}
	public void setConNumber(String conNumber) {
		ConNumber = conNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConPassword() {
		return ConPassword;
	}
	public void setConPassword(String conPassword) {
		ConPassword = conPassword;
	}
}
	
	

