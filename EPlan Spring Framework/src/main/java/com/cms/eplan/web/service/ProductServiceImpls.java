package com.cms.eplan.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cms.eplan.web.dao.ProductDao;
import com.cms.eplan.web.model.Product;

/**
 * 
 * @author Tamilselvan T Date : 02-01-2019
 *
 */
@Service 
@Transactional
public class ProductServiceImpls implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getProductList() {
		
		return productDao.getProductList();
	}

}
