package com.cms.eplan.web.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.ProductFeatures;

/**
 * 
 * @author Tamilselvan T
 * Date : 28-01-2019
 *
 */

@Repository
@Transactional
public class ProductJoinFeatureDaoImpls implements ProductJoinFeatureDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<ProductFeatures> getListFeature(int id) {
			Session session =sessionFactory.getCurrentSession();
			List <Object> list = (List<Object>) session.createQuery("SELECT featureId from ProductJoinFeatures where productId =:id")
					.setParameter("id", id).getResultList();
			
 
		return (List<ProductFeatures>)session.createQuery("from ProductFeatures where id in (:id)").setParameter("id", list).getResultList();
	}

}
