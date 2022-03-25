package com.lti.insurance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class LoginPojo 
{
	@Id
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	
	
	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginPojo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginPojo [email=" + email + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
