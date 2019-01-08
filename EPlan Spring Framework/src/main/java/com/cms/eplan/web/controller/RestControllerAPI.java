package com.cms.eplan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cms.eplan.web.model.Option;
import com.cms.eplan.web.service.FeatureOptionService;

/**
 * 
 * @author Tamilselvan T
 * Date : 08-01-2019
 *
 */


@RestController
@RequestMapping("/api")
public class RestControllerAPI {
	
	@Autowired
	FeatureOptionService featureOptionService;
	
	@GetMapping("/option")
	public List<Option> getOption(@RequestParam ("productId") int productId){
		
		//System.out.println("list of values ==>"+(List<Option>)featureOptionService.findById(productId));
		return (List<Option>)featureOptionService.findById(productId);
	}

}
