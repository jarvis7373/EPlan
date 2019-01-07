package com.cms.eplan.web.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.ProductFeatures;

/**
 * 
 * @author Tamilselvan T
 * Date : 03-01-2019
 *
 */

@Repository
public class ProductFeaturesDaoImpls implements ProductFeaturesDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<ProductFeatures> getAllFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(ProductFeatures feature) {
		// TODO Auto-generated method stub
		return 0;
	}

}
