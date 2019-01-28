package com.cms.eplan.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.EngineTypeDao;
import com.cms.eplan.web.dao.FeatureOptionDao;
import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.FeatureOptionMapp;
import com.cms.eplan.web.model.Option;

/**
 * 
 * @author Babu
 * Date : 07-01-2019
 *
 */

@Service
public class EngineTypeImps implements EngineTypeService {

	@Autowired
	EngineTypeDao EType;
	
	

	@Override
	public void addType(EngineType EngineType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EngineType> getTypes(int id) {
		
		return EType.getTypes(id);
	}

}
