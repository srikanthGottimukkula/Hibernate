package in.srikanth.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.srikanth.dao.ProductDAO;
import in.srikanth.entity.CategoryEntity;

public class ProductDaoImpl implements ProductDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCategory(CategoryEntity entity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("Category with Product saved successfully!!!");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		CategoryEntity categoryEntity = em.find(CategoryEntity.class, categoryId);
		em.close();
		return categoryEntity;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		CategoryEntity categoryEntity = em.find(CategoryEntity.class, categoryId);
		tx.begin();
		try {
			em.remove(categoryEntity);
			tx.commit();
			System.out.println("Category with Product removed successfully!!!");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
