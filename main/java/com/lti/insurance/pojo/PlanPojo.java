package com.lti.insurance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="plans")
public class PlanPojo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planId; 
	
	@Column(name="vhicle_Type")
	private String vehicleType;
	@Column(name="Plans")
	private String plan;
	@Column(name="Year")
	private String year;
	
	@OneToOne
	private Registration registration;
	
	

	public PlanPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlanPojo(int planId, String vehicleType, String plan, String year, Registration registration) {
		super();
		this.planId = planId;
		this.vehicleType = vehicleType;
		this.plan = plan;
		this.year = year;
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "PlanPojo [planId=" + planId + ", vehicleType=" + vehicleType + ", plan=" + plan + ", year=" + year
				+ ", registration=" + registration + "]";
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
	
	
 
	
	
}
