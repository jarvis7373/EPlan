package com.cms.eplan.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.Product;

/**
 * 
 * @author Tamilselvan T 
 * Date : 20-01-2019
 *
 */
@Repository
public class ProductDaoImpls implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getProductList() {
		Session session =sessionFactory.getCurrentSession();
		
		return (List<Product>)session.createCriteria(Product.class).list();
	}

}
