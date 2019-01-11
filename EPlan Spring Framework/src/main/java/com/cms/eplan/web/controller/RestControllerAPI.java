package com.cms.eplan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.Option;
import com.cms.eplan.web.service.EngineTypeService;
import com.cms.eplan.web.service.FeatureOptionService;

/**
 * 
 * @author Tamilselvan T
 * Date : 08-01-2019
 *
 */



@RequestMapping("/api")
@RestController
public class RestControllerAPI {
	
	@Autowired
	FeatureOptionService featureOptionService;
	@Autowired
	EngineTypeService typeofengine ;

	
	@GetMapping("/option")
	public List<Option> getOption(@RequestParam ("productId") int productId){
		
		System.out.println("list of values ==>"+(List<Option>)featureOptionService.findById(productId));
		return (List<Option>)featureOptionService.findById(productId);
	}
	
		
	@GetMapping("/EngineType")
	public List<EngineType> getType(@RequestParam ("EngineType") int eid){
		
		System.out.println("list of values ==>"+(List<EngineType>)typeofengine.getTypes(eid));
		return (List<EngineType>)typeofengine.getTypes(eid);
	}

}
