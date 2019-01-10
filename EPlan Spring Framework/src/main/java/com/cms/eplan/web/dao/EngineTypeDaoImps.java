package com.cms.eplan.web.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.EngineType;


/**
 * 
 * @author nagbabu
 *
 */
@Repository
@Transactional
public class EngineTypeDaoImps implements EngineTypeDao {

	@Autowired
	org.hibernate.SessionFactory SessionFactory;

	@Override
	public void addEngineType(EngineType Etype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EngineType> getTypes(int id) {
		Session session = SessionFactory.getCurrentSession();
		
		return (List<EngineType>)session.createQuery("from EngineType").getResultList();
	}
	
	

}
