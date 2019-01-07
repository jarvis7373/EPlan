package com.cms.eplan.web.service;

import java.util.List;

import com.cms.eplan.web.model.FeatureOptionMapp;

/**
 * 
 * @author Tamilselvan T
 * Date  :  07-10-2019
 *
 */

public interface FeatureOptionService {

	public List<FeatureOptionMapp> findById(int id);
}
