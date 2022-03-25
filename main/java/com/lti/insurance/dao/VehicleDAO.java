package com.lti.insurance.dao;

import java.util.List;

import com.lti.insurance.pojo.Vehicle;


public interface VehicleDAO
{
		public boolean addVehicle(Vehicle vehicle);
		public List<Vehicle> getVehicles();
}