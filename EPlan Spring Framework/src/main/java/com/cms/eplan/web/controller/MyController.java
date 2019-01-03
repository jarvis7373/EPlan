package com.cms.eplan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.eplan.web.service.ProductService;


@Controller
public class MyController {

	@Autowired
	ProductService service;
	
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
	public String getProductModel(){
		
		
		return "";
	}
}
