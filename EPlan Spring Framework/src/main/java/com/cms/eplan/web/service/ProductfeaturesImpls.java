package com.cms.eplan.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.ProductFeaturesDao;
import com.cms.eplan.web.model.ProductFeatures;

/**
 * 
 * @author Tamilselvan
 * Date : 03-01-2019
 *
 */

@Service
@Transactional
public class ProductfeaturesImpls implements ProductFeaturesService {

	@Autowired
	ProductFeaturesDao proFeatures;
	
	@Override
	public List<ProductFeatures> getAllFeatures() {
		// TODO Auto-generated method stub
		return proFeatures.getAllFeatures();
	}

	@Override
	public int save(ProductFeatures feature) {
		// TODO Auto-generated method stub
		return proFeatures.save(feature);
	}

}
