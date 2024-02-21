package in.srikanth.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import in.srikanth.dao.StudentDAO;
import in.srikanth.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {

	SessionFactory factory;

	public StudentDAOImpl() {
		ServiceRegistry sr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metaData = new MetadataSources(sr).getMetadataBuilder().build();
		factory = metaData.getSessionFactoryBuilder().build();
	}

	@Override
	public void saveStudent(StudentEntity student) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(student);
			System.out.println("Student object persisted in database!!");
			transaction.commit();
		} catch (Exception ex) {
			transaction.rollback();
			System.out.println("Issue in Student database!!");
			System.out.println(ex);
		} finally {
			session.close();
			factory.close();
		}

	}

}
