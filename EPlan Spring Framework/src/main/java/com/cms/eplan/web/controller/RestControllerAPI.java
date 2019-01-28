package com.cms.eplan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.FuelCapacity;
import com.cms.eplan.web.model.Option;
import com.cms.eplan.web.model.TransmissionType;
import com.cms.eplan.web.service.EngineTypeService;
import com.cms.eplan.web.service.FeatureOptionService;
import com.cms.eplan.web.service.TransmissionTypeService;
import com.cms.eplan.web.service.FuelCapacityService;

/**
 * 
 * @author Babu
 * Date : 08-01-2019
 *
 */




@RestController
public class RestControllerAPI {
	
	@Autowired
	FeatureOptionService featureOptionService;
	@Autowired
	EngineTypeService typeofengine ;
	@Autowired
	TransmissionTypeService typeoftransmission;
	@Autowired
	FuelCapacityService FType;

	
	@GetMapping(value="/api/option",produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Option> getOption(@RequestParam ("productId") int productId){
		
		System.out.println("list of values ==>"+(List<Option>)featureOptionService.findById(productId));
		return (List<Option>)featureOptionService.findById(productId);
	}
		
	@GetMapping(value="/api/EngineType",produces=MediaType.APPLICATION_JSON_VALUE) 
	@ResponseBody
	public List<EngineType> getType(@RequestParam ("EngineType") int eid){
		
		System.out.println("list of values ==>"+(List<EngineType>)typeofengine.getTypes(eid));
		
		return (List<EngineType>)typeofengine.getTypes(eid);
	}

	@GetMapping(value="/api/TransmissionType",produces=MediaType.APPLICATION_JSON_VALUE) 
	@ResponseBody
	public List<TransmissionType> getId(@RequestParam ("TransmissionType") int id){
		
		System.out.println("list of values ==>"+(List<TransmissionType>)typeoftransmission.getId(id));
		
		return (List<TransmissionType>)typeoftransmission.getId(id);
	}
	
	@GetMapping(value="/api/FuelCapacity",produces=MediaType.APPLICATION_JSON_VALUE) 
	@ResponseBody
	public List<FuelCapacity> getFID(@RequestParam ("FuelCapacity") int id1){
		
		System.out.println("list of values ==>"+(List<FuelCapacity>)FType.getId(id1));
		
		return (List<FuelCapacity>)FType.getId(id1);
	}
	
}
