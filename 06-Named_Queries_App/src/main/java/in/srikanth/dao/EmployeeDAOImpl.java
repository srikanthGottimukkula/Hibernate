package in.srikanth.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import in.srikanth.constants.AppConstants;
import in.srikanth.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public List<EmployeeEntity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> typedQuery = em.createNamedQuery("Query1", EmployeeEntity.class);
		typedQuery.setParameter(1, 10);
		List<EmployeeEntity> resultList = typedQuery.getResultList();
		return resultList;
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
	
	//NamedQuery we can use createNamedQuery
	@Override
	public List<EmployeeEntity> executeNamedQuery(int deptNo) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createNamedQuery("Query1", EmployeeEntity.class);
		tq.setParameter(1, deptNo);
		List<EmployeeEntity> resultList = tq.getResultList();
		return resultList ;
	}
	
	//NamedNativeQuery we can use createNamedQuery
	@Override
	public List executeNamedNativeQuery(int sal) {
		EntityManager em = factory.createEntityManager();
		Query q = em.createNamedQuery("Query2");
		q.setParameter(1, sal);
		List list = q.getResultList();
		em.close();
		return list;
	}
}
