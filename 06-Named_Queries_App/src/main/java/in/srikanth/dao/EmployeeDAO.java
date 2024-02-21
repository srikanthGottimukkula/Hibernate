package in.srikanth.dao;

import java.util.List;

import in.srikanth.entity.EmployeeEntity;

public interface EmployeeDAO {
	
//	EmployeeEntity fetchEmployeeById(Integer empno);

	List<EmployeeEntity> fetchEmployees();

//	List<Object[]> fetchNamesAndSalaries();
	
	List<EmployeeEntity> executeNamedQuery(int deptNo);
	
	List executeNamedNativeQuery(int sal);

}
