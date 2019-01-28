package com.cms.eplan.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cms.eplan.web.dao.FuelCapacityDao;
import com.cms.eplan.web.model.FuelCapacity;


@Repository
@Service
@Transactional
public class FuelCapacityImpls implements FuelCapacityService {
	
	
	@Autowired
	FuelCapacityDao FType;

	
	public void addFuelTankType(FuelCapacity Ftype) {
		// TODO Auto-generated method stub
		
	}

	public List<FuelCapacity> getId(int id1) {
		// TODO Auto-generated method stub
		return FType.getId(id1);
	}

}
