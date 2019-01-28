package com.cms.eplan.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Tamilselvan T Date : 03-01-2019
 *
 */

@Entity
@Table(name = "E_FEATURES")
public class ProductFeatures {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "F_ID")
	private int id;

	@Column(name = "INTERNAL_NAME")
	private String internalName;

	@Column(name = "DISPLAY_NAME")
	private String displayName;

	@Column(name = "IMAGE_NAME")
	private String imageName;

	@Column(name = "FLAG_STATUS")
	private String flagStatus;

	@Column(name = "ACTIVE_STATUS")
	private String activeStatus;

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
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(String flagStatus) {
		this.flagStatus = flagStatus;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

}
