package com.cms.eplan.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author TAMILSELVAN T DATE : 07-10-2018
 *
 */

@Entity
@Table(name = "E_FEATURE_OPTION")
public class FeatureOptionMapp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "PRODUCT_ID")
	private Product product;

	@Column(name = "FEATURE_ID")
	private ProductFeatures feature;

	@Column(name = "OPTION_ID")
	private Option option;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductFeatures getFeature() {
		return feature;
	}

	public void setFeature(ProductFeatures feature) {
		this.feature = feature;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

}
