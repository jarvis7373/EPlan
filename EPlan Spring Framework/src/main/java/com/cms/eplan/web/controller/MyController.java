package com.cms.eplan.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.eplan.web.model.Option;
import com.cms.eplan.web.service.FeatureOptionService;
import com.cms.eplan.web.service.ProductJoinFeatureService;
import com.cms.eplan.web.service.ProductService;


@Controller
public class MyController {

	private final Logger logger=LoggerFactory.getLogger(MyController.class.getName());
	
	
	@Autowired
	ProductService service;
	@Autowired
	FeatureOptionService featureOptionService;
	@Autowired
	ProductJoinFeatureService productFeatureService;
	
	@RequestMapping("/")
	public String indexPage(ModelMap map){
		map.put("productList", service.getProductList());
		return "index"; 
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage(@RequestParam("productSel") int productSel,ModelMap map){
		
		map.put("features", productFeatureService.getListOfFeature(productSel));
		//map.put("EngineType");
		
		return "homenew";
	}
	
	@RequestMapping("/model")
	@ResponseBody
	public List<Option> getProductModel(@RequestParam ("productId") int productId){
		
		System.out.println("list of values ==>"+(List<Option>)featureOptionService.findById(productId));
		
		return featureOptionService.findById(productId);
	}
}
