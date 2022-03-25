package com.lti.insurance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Claim")
public class ClaimPojo 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="claimID")
	private int claimID;
	
	@Column(name="claimDate")
	private String date;
	
	@Column(name="Number")
	private String number;
	
	@Column(name="CustomerID")
	private String custid;
	
	@Column(name="PolicyID")
	private String policy;
	
	@Column(name="ReasonToclaim")
	private String reason;
	
	public ClaimPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClaimPojo(int claimID, String date, String number, String custid, String policy, String reason) {
		super();
		this.claimID = claimID;
		this.date = date;
		this.number = number;
		this.custid = custid;
		this.policy = policy;
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "ClaimPojo [claimID=" + claimID + ", date=" + date + ", number=" + number + ", custid=" + custid
				+ ", policy=" + policy + ", reason=" + reason + "]";
	}
	public int getClaimID() {
		return claimID;
	}
	public void setClaimID(int claimID) {
		this.claimID = claimID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
