package in.srikanth.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import in.srikanth.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	// CriteriaBuilder is helper class to construct the
//	criteriaQuery object and criteriaQuery object helps to construct the condition

	@Override
	public List<EmployeeEntity> executeCriteriaQuery() {
		EntityManager em = factory.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<EmployeeEntity> q = cb.createQuery(EmployeeEntity.class);
		Root<EmployeeEntity> root = q.from(EmployeeEntity.class);
		q.select(root).where(cb.gt(root.get("salary"), 5000));
		TypedQuery<EmployeeEntity> query = em.createQuery(q);
		List<EmployeeEntity> list = query.getResultList();
		em.close();
		return list;
	}
}
