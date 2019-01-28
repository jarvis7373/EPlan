package com.cms.eplan.web.service;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import com.cms.eplan.web.model.FuelCapacity;

public interface FuelCapacityService {
	public void addFuelTankType(FuelCapacity Ftype);
	public List<FuelCapacity> getId(int id1);
}
