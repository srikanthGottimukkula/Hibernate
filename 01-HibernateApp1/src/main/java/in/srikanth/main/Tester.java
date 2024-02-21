package in.srikanth.main;

import in.srikanth.dao.StudentDAO;
import in.srikanth.dao.impl.StudentDAOImpl;
import in.srikanth.entity.StudentEntity;

public class Tester {
	public static void main(String[] args) {

		StudentDAO daoImpl = new StudentDAOImpl();

		StudentEntity student = new StudentEntity();
		student.setSid(100);
		student.setsName("srikanth");
		student.setGender("Male");
		student.setMarks(400);

		daoImpl.saveStudent(student);

	}
}
