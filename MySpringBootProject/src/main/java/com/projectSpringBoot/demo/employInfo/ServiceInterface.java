package com.projectSpringBoot.demo.employInfo;

import java.util.List;

public interface ServiceInterface {
	public EmployInfo saveEmployInfo(EmployInfo employInfo);
	public EmployInfo getEmployId(long employId);
	public List<EmployInfo> getEmployeesByIds(List<Long> employIds);
	public List<EmployInfo>getAllEmployees();
}
