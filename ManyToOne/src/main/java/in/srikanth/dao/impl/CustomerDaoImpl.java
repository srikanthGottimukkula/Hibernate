package in.srikanth.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.srikanth.dao.CustomerDao;
import in.srikanth.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCustomer(Customer customer) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(customer);
			tx.commit();
			System.out.println("saved!!");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

//	@Override
//	public Customer fetchCustomer(Integer custID) {
//		return null;
//	}
//
//	@Override
//	public void deleteCustomer(Integer custID) {
//
//	}

}