package in.srikanth.dao;

import java.util.List;

import in.srikanth.entity.EmployeeEntity;

public interface EmployeeDAO {
	
	List<EmployeeEntity> executeCriteriaQuery();

}