package in.srikanth.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import in.srikanth.constants.AppConstants;
import in.srikanth.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	// select using sql queries
//	@Override
//	public List<EmployeeEntity> fetchEmployees() {
//		EntityManager em = factory.createEntityManager();
//		String sqlString = "SELECT * from emp WHERE Dept_No=?";
//		Query q = em.createNativeQuery(sqlString, EmployeeEntity.class);
//		q.setParameter(1, 10);
//		List resultList = q.getResultList();
//		return resultList;
//
//	}
	
	@Override
	public String fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		String sqlString = "update emp set salary=? where Dept_No=?";
		Query q = em.createNativeQuery(sqlString);
		q.setParameter(1, 100);
		 int executeUpdate = q.executeUpdate();
		System.out.println("The numbers of rows Effected!!"+executeUpdate);
	return "The numbers of rows Effected!!"+executeUpdate;

	}

//	@Override
//	public List<Object[]> fetchNamesAndSalaries() {
//		EntityManager em = factory.createEntityManager();
//		TypedQuery<Object[]> typedQuery = em.createQuery(AppConstants.QUERY3, Object[].class);
//		List<Object[]> resultList = typedQuery.getResultList();
//		em.close();
//		return resultList;
//	}
//
//	@Override
//	public EmployeeEntity fetchEmployeeById(Integer empno) {
//		EntityManager em = factory.createEntityManager();
//		TypedQuery<EmployeeEntity> typedQuery = em.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
//		typedQuery.setParameter(1, empno);
//		EmployeeEntity singleResult = typedQuery.getSingleResult();
//		em.close();
//		return singleResult;
//	}

//	@Override
//	public void updateEmployees() {
//		EntityManager em = factory.createEntityManager();
//		String sqlString = "update emp set salary=? where Dept_No=?";
//		Query q = em.createNativeQuery(sqlString);
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		int x = q.executeUpdate();
//		tx.commit();
//
//	}
}
