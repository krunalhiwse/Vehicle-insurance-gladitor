package com.lti.insurance.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
public class Claim 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int claimid;
	private String typeofaction;
	private String approvalStatus;
	private double claimamount;
	private double approvedamount;
	private String aadharcard;
	
	@Override
	public String toString() {
		return "claim [claimid=" + claimid + ", typeofaction=" + typeofaction + ", approvalStatus=" + approvalStatus
				+ ", claimamount=" + claimamount + ", approvedamount=" + approvedamount + ", aadharcard=" + aadharcard
				+ "]";
	}
	public Claim(int claimid, String typeofaction, String approvalStatus, double claimamount, double approvedamount,
			String aadharcard) {
		super();
		this.claimid = claimid;
		this.typeofaction = typeofaction;
		this.approvalStatus = approvalStatus;
		this.claimamount = claimamount;
		this.approvedamount = approvedamount;
		this.aadharcard = aadharcard;
	}
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClaimid() {
		return claimid;
	}
	public void setClaimid(int claimid) {
		this.claimid = claimid;
	}
	public String getTypeofaction() {
		return typeofaction;
	}
	public void setTypeofaction(String typeofaction) {
		this.typeofaction = typeofaction;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public double getClaimamount() {
		return claimamount;
	}
	public void setClaimamount(double claimamount) {
		this.claimamount = claimamount;
	}
	public double getApprovedamount() {
		return approvedamount;
	}
	public void setApprovedamount(double approvedamount) {
		this.approvedamount = approvedamount;
	}
	public String getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}
	
}
