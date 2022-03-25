package com.lti.insurance.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class VehicleInsurance 
{
	@Id
	private int insid;
	private String issuedate;
	private String expirydate;
	private int duration;
	
	@Override
	public String toString() {
		return "Insurance [insid=" + insid + ", issuedate=" + issuedate + ", expirydate=" + expirydate + ", duration="
				+ duration + "]";
	}
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(int insid, String issuedate, String expirydate, int duration) {
		super();
		this.insid = insid;
		this.issuedate = issuedate;
		this.expirydate = expirydate;
		this.duration = duration;
	}
	public int getInsid() {
		return insid;
	}
	public void setInsid(int insid) {
		this.insid = insid;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}

