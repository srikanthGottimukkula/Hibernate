package in.srikanth.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.srikanth.entity.StudentCompositeKey;
import in.srikanth.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveStudent(StudentEntity stdEntity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(stdEntity);
			tx.commit();
			System.out.println("Student entity stored successfully!!");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Issue with the database!!");
		} finally {
			em.close();
		}
	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		EntityManager em = factory.createEntityManager();
		StudentEntity studentEntity = em.find(StudentEntity.class, compositeKey);
		em.close();
		return studentEntity;
	}
}
