package com.cms.eplan.web.dao;

import java.util.List;

import com.cms.eplan.web.model.Product;

/**
 * 
 * @author Tamilselvan T 
 * Date : 02-01-2019
 *
 */

public interface ProductDao {

	public void addProduct(Product product);
	public List<Product> getProductList();
}
