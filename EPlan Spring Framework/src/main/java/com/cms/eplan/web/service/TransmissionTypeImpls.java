package com.cms.eplan.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.EngineTypeDao;
import com.cms.eplan.web.dao.FeatureOptionDao;
import com.cms.eplan.web.dao.TransmissionTypeDao;
import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.FeatureOptionMapp;
import com.cms.eplan.web.model.Option;
import com.cms.eplan.web.model.TransmissionType;

/**
 * 
 * @author Babu
 * Date : 07-01-2019
 *
 */

@Service
public class TransmissionTypeImpls implements TransmissionTypeService {

	@Autowired
	TransmissionTypeDao typeoftransmission;
	
	

	@Override
	public void addTransmission(TransmissionType TransmissionType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TransmissionType> getId(int id) {
		
		return typeoftransmission.getId(id);
	}

}
