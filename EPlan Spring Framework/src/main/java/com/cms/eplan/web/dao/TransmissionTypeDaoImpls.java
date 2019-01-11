package com.cms.eplan.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.Product;
import com.cms.eplan.web.model.TransmissionType;;

/**
 * 
 * @author Babu 
 * Date : 20-01-2019
 *
 */
@Repository
public class TransmissionTypeDaoImpls implements TransmissionTypeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addTransmission(TransmissionType TransmissionType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TransmissionType> getId(int id) {
		Session session =sessionFactory.getCurrentSession();
		
		return (List<TransmissionType>)session.createCriteria(TransmissionType.class).list();
	}

}
