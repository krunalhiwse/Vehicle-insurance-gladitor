package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.pojo.Vehicle;



public interface VehicleService 
{

	public boolean addVehicle(Vehicle vehicle);
	public List<Vehicle> getVehicles();
}
