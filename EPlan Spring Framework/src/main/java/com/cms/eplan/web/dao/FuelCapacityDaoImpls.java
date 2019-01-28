package com.cms.eplan.web.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.FuelCapacity;



/**
 * 
 * @author Babu
 *
 */
@Repository
@Transactional
public class FuelCapacityDaoImpls implements FuelCapacityDao {

	@Autowired
	org.hibernate.SessionFactory SessionFactory;

	@Override
	public void addFuelTankType(FuelCapacity Ftype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FuelCapacity> getId(int id1) {
		Session session = SessionFactory.getCurrentSession();
		
		return (List<FuelCapacity>)session.createCriteria(FuelCapacity.class).list();
	}

	
		
	}
	
	


