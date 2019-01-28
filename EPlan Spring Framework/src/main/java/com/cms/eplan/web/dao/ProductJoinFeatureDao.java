package com.cms.eplan.web.dao;

import java.util.List;

import com.cms.eplan.web.model.ProductFeatures;

/**
 * 
 * @author Tamilselvan T
 * Date : 28-01-2019
 *
 */

public interface ProductJoinFeatureDao {
 
	public List<ProductFeatures> getListFeature(int id);
}
