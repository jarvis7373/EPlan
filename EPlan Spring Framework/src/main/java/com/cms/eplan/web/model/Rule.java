package com.cms.eplan.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author nagba
 *
 */

@Entity
@Table(name = "E_RULE")
public class Rule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "OPTION_ID_A")
	private int optionAId;

	@Column(name = "P_ID")
	private int productId;

	@Column(name = "OPTION_ID_B")
	private int optionBId;

	@Column(name = "RULE_TYPE")
	private String ruleType;

	@Column(name = "FLAG_STATUS")
	private int flagStatus;

	@Column(name = "ACTIVE_STATUS")
	private String activeFlag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOptionAId() {
		return optionAId;
	}

	public void setOptionAId(int optionAId) {
		this.optionAId = optionAId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOptionBId() {
		return optionBId;
	}

	public void setOptionBId(int optionBId) {
		this.optionBId = optionBId;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public int getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(int flagStatus) {
		this.flagStatus = flagStatus;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

}
