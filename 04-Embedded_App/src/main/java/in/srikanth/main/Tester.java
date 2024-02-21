package in.srikanth.main;

import in.srikanth.dao.StudentDAO;
import in.srikanth.dao.StudentDAOImpl;
import in.srikanth.entity.StudentCompositeKey;
import in.srikanth.entity.StudentEntity;

public class Tester {

	public static void main(String[] args) {

		StudentDAO daoImpl = new StudentDAOImpl();

		/*
		 * StudentCompositeKey compositeKey = new StudentCompositeKey();
		 * compositeKey.setRollNumber(121); compositeKey.setSection("A");
		 * 
		 * StudentEntity se = new StudentEntity(); se.setCompositeKey(compositeKey);
		 * se.setMarks(499); se.setStudentName("Srikanth"); daoImpl.saveStudent(se);
		 */

		// fetch Student
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNumber(121);
		compositeKey.setSection("A");
		
		StudentEntity entity = daoImpl.fetchStudent(compositeKey);
		System.out.println("name:"+entity.getStudentName());
		System.out.println("marks:"+entity.getMarks());

	}

}
