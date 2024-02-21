package in.srikanth.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import in.srikanth.constants.AppConstants;
import in.srikanth.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public List<EmployeeEntity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> typedQuery = em.createQuery(AppConstants.QUERY2, EmployeeEntity.class);
		List<EmployeeEntity> list = typedQuery.getResultList();
		em.close();
		return list;
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> typedQuery = em.createQuery(AppConstants.QUERY3, Object[].class);
		List<Object[]> resultList = typedQuery.getResultList();
		em.close();
		return resultList;
	}

	@Override
	public EmployeeEntity fetchEmployeeById(Integer empno) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> typedQuery = em.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
		typedQuery.setParameter(1, empno);
		EmployeeEntity singleResult = typedQuery.getSingleResult();
		em.close();
		return singleResult;
	}
}
