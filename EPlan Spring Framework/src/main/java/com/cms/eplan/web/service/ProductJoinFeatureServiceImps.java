package com.cms.eplan.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.ProductJoinFeatureDao;
import com.cms.eplan.web.model.ProductFeatures;

/**
 * 
 * @author Tamilselvan T
 * Date : 28-01-2019
 *
 */

@Service
public class ProductJoinFeatureServiceImps implements ProductJoinFeatureService {

	@Autowired
	ProductJoinFeatureDao productFeatureDao;
	
	@Override
	public List<ProductFeatures> getListOfFeature(int id) {
		// TODO Auto-generated method stub
		return productFeatureDao.getListFeature(id);
	}

}
