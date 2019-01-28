package com.cms.eplan.web.dao;

import java.util.List;

import com.cms.eplan.web.model.FuelCapacity;

public interface FuelCapacityDao {
	
	

		public void addFuelTankType(FuelCapacity Ftype);
		
		public List<FuelCapacity> getId(int id1);
	}


