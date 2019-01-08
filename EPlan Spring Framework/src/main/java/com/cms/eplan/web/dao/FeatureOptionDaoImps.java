package com.cms.eplan.web.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import com.cms.eplan.web.model.FeatureOptionMapp;
import com.cms.eplan.web.model.Option;

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
	public List<Option> findById(int id) {
		Session session= sessionFactory.getCurrentSession();
		List<Option> optionList = new ArrayList<Option>();
		//List<Object> list =session.createQuery("SELECT optionId from FeatureOptionMapp where productId=:id").setParameter("id", id).getResultList();
		List<FeatureOptionMapp> list  =session.createQuery("SELECT option from FeatureOptionMapp where product=:id").setParameter("id", id).getResultList();
		if(list.size() > 0){
			optionList=(List<Option>)session.createQuery("select DisplayName from Option where id in (:ids)").setParameterList("ids", list).getResultList();
		}
		return  optionList;
		
	}

}
