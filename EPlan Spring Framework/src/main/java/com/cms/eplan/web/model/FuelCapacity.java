package com.cms.eplan.web.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "E_FUEL_TANK_CAPACITY")
public class FuelCapacity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "F_ID")
	private int id1;

	@Column(name = "F_TYPE")
	private String FName;

	@Column(name = "DISPLAY_NAME")
	private String DisplayName;

	@Column(name = "IMAGE_NAME")
	private String imageName;

	@Column(name = "FLAG_STATUS")
	private String flagStatus;

	@Column(name = "ACTIVE_STATUS")
	private String activeFlag;
	
	
	public FuelCapacity(){
		
	}

	public FuelCapacity(int id, String eName, String displayName, String imageName, String flagStatus,
			String activeFlag) {
		super();
		this.id1 = id1;
		FName = FName;
		DisplayName = displayName;
		this.imageName = imageName;
		this.flagStatus = flagStatus;
		this.activeFlag = activeFlag;
	}

	public int getId() {
		return id1;
	}

	public void setId(int id) {
		this.id1 = id;
	}

	public String getEName() {
		return FName;
	}

	public void setEName(String EName) {
		this.FName = FName;
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

	/*@Override
	public String toString() {
		return "EngineType [id=" + id + ", EName=" + EName + ", DisplayName=" + DisplayName + ", imageName=" + imageName
				+ ", flagStatus=" + flagStatus + ", activeFlag=" + activeFlag + "]";
	}*/

	
	

}