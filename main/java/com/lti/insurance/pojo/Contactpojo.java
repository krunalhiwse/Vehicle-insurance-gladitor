package com.lti.insurance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contactpojo 
{
	@Id
	@Column(name="Email")
	private String Email;
	@Column(name="First_Name")
	private String FName;
	@Column(name="Last_Name")
	private String Lname;
	@Column(name="Text")
	private String Text;
	
	
	public Contactpojo(String email, String fName, String lname, String text) {
		super();
		Email = email;
		FName = fName;
		Lname = lname;
		Text = text;
	}
	public Contactpojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contactpojo [Email=" + Email + ", FName=" + FName + ", Lname=" + Lname + ", Text=" + Text + "]";
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	
	
}
