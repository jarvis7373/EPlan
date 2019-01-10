package com.cms.eplan.web.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "E_ENGINETYPE")
public class EngineType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "E_ID")
	private int id;

	@Column(name = "E_TYPE")
	private String EName;

	@Column(name = "DISPLAY_NAME")
	private String DisplayName;

	@Column(name = "IMAGE_NAME")
	private String imageName;

	@Column(name = "FLAG_STATUS")
	private String flagStatus;

	@Column(name = "ACTIVE_STATUS")
	private String activeFlag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
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

	public String getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(String flagStatus) {
		this.flagStatus = flagStatus;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	
	

}