package com.cms.eplan.web.service;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import com.cms.eplan.web.model.EngineType;

public interface EngineTypeService {
	public void addType(EngineType EngineType);
	public List<EngineType> getTypes(int id);
}
