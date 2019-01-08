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
	private int product;

	@Column(name = "FEATURE_ID")
	private int feature;

	@Column(name = "OPTION_ID")
	private int option;

	public FeatureOptionMapp(){
		
	}
	
	public FeatureOptionMapp(int id, int product, int feature, int option) {
		super();
		this.id = id;
		this.product = product;
		this.feature = feature;
		this.option = option;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getFeature() {
		return feature;
	}

	public void setFeature(int feature) {
		this.feature = feature;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	

}
