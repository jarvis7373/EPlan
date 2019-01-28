package com.cms.eplan.web.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.EngineTypeDao;
import com.cms.eplan.web.dao.FeatureOptionDao;
import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.FeatureOptionMapp;
import com.cms.eplan.web.model.Option;

/**
 * 
 * @author Tamilselvan T
 * Date : 07-01-2019
 *
 */

@Service
public class EngineTypeImps implements EngineTypeService {

	@Autowired
	EngineTypeDao EType;
    
	private final Logger logger=LoggerFactory.getLogger(EngineTypeImps.class);
	

	@Override
	public void addType(EngineType EngineType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EngineType> getTypes(int id) {
		logger.debug("Engine Type Service working");
		return EType.getTypes(id);
	}

}
