package com.cms.eplan.web.dao;

import java.util.List;

import com.cms.eplan.web.model.EngineType;


/**
 * 
 * @author Nbabu/Tselvan
 * 08-01-2019
 *
 */

public interface EngineTypeDao {

	public void addEngineType(EngineType Etype);
	
	public List<EngineType> getTypes(int id);
}
