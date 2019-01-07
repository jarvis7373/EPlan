package com.cms.eplan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.eplan.web.model.FeatureOptionMapp;
import com.cms.eplan.web.service.FeatureOptionService;
import com.cms.eplan.web.service.ProductService;


@Controller
public class MyController {

	@Autowired
	ProductService service;
	@Autowired
	FeatureOptionService featureOptionService;
	
	@RequestMapping("/")
	public String indexPage(){
		return "index"; 
	}
	
	
	@RequestMapping("/homePage")
	public String homePage(ModelMap map){
		//System.out.println("vaslue : "+service.getProductList());
		map.put("productList", service.getProductList());
		return "home";
	}
	
	@RequestMapping("/model")
	@ResponseBody
	public List<FeatureOptionMapp> getProductModel(@RequestParam ("productId") int productId){
		
		System.out.println("list of values ==>"+featureOptionService.findById(productId));
		return featureOptionService.findById(productId);
	}
}
