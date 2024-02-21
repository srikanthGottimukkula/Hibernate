package in.srikanth;

import java.util.List;

import in.srikanth.dao.EmployeeDAO;
import in.srikanth.dao.EmployeeDAOImpl;
import in.srikanth.entity.EmployeeEntity;

public class Tester {

	public static void main(String[] args) {
		
		// selecting single emp
//		EmployeeDAO daoImpl = new EmployeeDAOImpl();
//		EmployeeEntity employeeEntity = daoImpl.fetchEmployeeById(7800);
//		System.out.println(employeeEntity);
		
		//Selecting all employees
		
//		EmployeeDAO daoImpl = new EmployeeDAOImpl();
//		List<EmployeeEntity> list = daoImpl.fetchEmployees();
//		list.forEach(System.out::println);
		
		//emp name and salaries
//		EmployeeDAO daoImpl = new EmployeeDAOImpl();
//		List<Object[]> lst = daoImpl.fetchNamesAndSalaries();
//		lst.forEach(obj->{
//			System.out.println("The Employee Name is: "+obj[0]+" And His salary per Month is : "+obj[1]);
//		});
		
		EmployeeDAO daoImpl = new EmployeeDAOImpl();
		String employees = daoImpl.fetchEmployees();
		System.out.println(employees);
		
	}
}
