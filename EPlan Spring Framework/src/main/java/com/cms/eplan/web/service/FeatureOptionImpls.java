package com.cms.eplan.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.FeatureOptionDao;
import com.cms.eplan.web.model.FeatureOptionMapp;

/**
 * 
 * @author Tamilselvan T
 * Date : 07-01-2019
 *
 */

@Service
public class FeatureOptionImpls implements FeatureOptionService {

	@Autowired
	FeatureOptionDao feature;
	
	@Override
	public List<FeatureOptionMapp> findById(int id) {
		// TODO Auto-generated method stub
		return feature.findById(id);
	}

}
