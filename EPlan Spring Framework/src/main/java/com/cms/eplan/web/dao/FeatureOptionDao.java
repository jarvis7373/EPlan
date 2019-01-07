package com.cms.eplan.web.dao;

import java.util.List;
import com.cms.eplan.web.model.FeatureOptionMapp;

/**
 * 
 * @author Tamilselvan T Date : 07-01-2019
 *
 */

public interface FeatureOptionDao {

	public List<FeatureOptionMapp> findById(int id);
}
