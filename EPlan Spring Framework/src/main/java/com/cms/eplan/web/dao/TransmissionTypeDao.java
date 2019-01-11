package com.cms.eplan.web.dao;

import java.util.List;

import com.cms.eplan.web.model.TransmissionType;


/**
 * 
 * @author Babu
 * 08-01-2019
 *
 */

public interface TransmissionTypeDao {

	public void addTransmission(TransmissionType TransmissionType);
	
	public List<TransmissionType> getId(int id);
	
	
}
