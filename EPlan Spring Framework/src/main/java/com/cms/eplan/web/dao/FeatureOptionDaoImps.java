package com.cms.eplan.web.dao;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.FeatureOptionMapp;

/**
 * 
 * @author Tamilselvan T
 * Date : 07-10-2019
 *
 */

@Repository
@Transactional
public class FeatureOptionDaoImps implements FeatureOptionDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<FeatureOptionMapp> findById(int id) {
		Session session= sessionFactory.getCurrentSession();
		//List<Object> list =session.createQuery("SELECT optionId from FeatureOptionMapp where productId=:id").setParameter("id", id).getResultList();
		
		return session.createQuery("SELECT option from FeatureOptionMapp where product=:id").setParameter("id", id).getResultList();
		
		
	}

}
