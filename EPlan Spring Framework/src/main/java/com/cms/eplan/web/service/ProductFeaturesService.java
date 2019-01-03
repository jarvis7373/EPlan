package com.cms.eplan.web.service;

import java.util.List;

import com.cms.eplan.web.model.ProductFeatures;

/**
 * 
 * @author Tamilselvan T
 * Date : 03-01-2019
 *
 */

public interface ProductFeaturesService {

	public List<ProductFeatures> getAllFeatures();
	public int save(ProductFeatures feature);
}
