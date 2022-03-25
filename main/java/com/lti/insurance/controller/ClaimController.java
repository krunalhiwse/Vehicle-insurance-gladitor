package com.lti.insurance.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.pojo.Claim;
import com.lti.insurance.pojo.VehicleInsurance;
import com.lti.insurance.service.ClaimService;
import com.lti.insurance.service.VehicleService;



@RestController
@RequestMapping("/claim")
public class ClaimController 
{

	@Autowired
	ClaimService service;
	
	@Autowired
	VehicleService vService;
	
	@PostMapping("/updatevehicle/{insuranceid}")
	public Claim addorUpdateVehicleClaim(@RequestBody Claim claim,@PathVariable("insuranceid") int insurnceid) {
		VehicleInsurance v=vService.findById(insurnceid);
		return service.addorupdateClaim(claim);
	}
	@GetMapping("/vehicle/{claimId}")
	public Claim findVehicleClaimByClaimId(@PathVariable("claimId") int claimId) {
		return service.findvclaimbyclaimid(claimId);
	}
	@GetMapping("/viewpendingvehicleclaims/{approvalStatus}")
	public List<Claim> viewAllPendingVehicleClaims(@PathVariable("approvalStatus") String approvalStatus){
		return service.viewAllPendingClaims(approvalStatus);
	}
	
	
}
