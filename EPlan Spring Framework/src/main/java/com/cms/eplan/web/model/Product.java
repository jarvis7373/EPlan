package com.cms.eplan.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * 
 * @author Tamilselvan T
 * @Date 31-12-2018
 *
 */
@Entity
@Table(name = "e_product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="P_ID")
	private int id;
	@Column(name="INTERNAL_NAME")
	private String internalName;
	@Column(name="DISPLAY_NAME")
	private String DisplayName;
	@Column(name="IMAGE_NAME")
	private String imageName;
	@Column(name="ACTIVE_STATUS")
	private String activieStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getDisplayName() {
		return DisplayName;
	}

	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getActivieStatus() {
		return activieStatus;
	}

	public void setActivieStatus(String activieStatus) {
		this.activieStatus = activieStatus;
	}
	

}
