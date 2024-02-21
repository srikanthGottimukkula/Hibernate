package in.srikanth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class EmployeeEntity {

	@Id
	@Column(name = "Emp_No")
	private Integer empNumber;

	@Column(name = "Emp_Name")
	private String empName;

	
	public EmployeeEntity() {
		super();
	}

//	public EmployeeEntity(Integer empNumber, String empName, Double salary, Integer deptNumber) {
//		this.empNumber = empNumber;
//		this.empName = empName;
//		this.salary = salary;
//		this.deptNumber = deptNumber;
//	}

	private Double salary;

	@Column(name = "Dept_No")
	private Integer deptNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary
				+ ", deptNumber=" + deptNumber + "]";
	}

}
