package in.srikanth.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.srikanth.dao.CatDao;
import in.srikanth.entity.DogEntity;

public class CatDaoImpl implements CatDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	
	@Override
	public void saveDog(DogEntity entity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("saved");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
	}

	@Override
	public DogEntity fetchDogId(Integer dogId) {
		EntityManager em = factory.createEntityManager();
		DogEntity dEntity = em.find(DogEntity.class, dogId);
		return dEntity;
	}
	
	@Override
	public void RemoveDog(Integer dogId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		DogEntity dEntity = em.find(DogEntity.class, dogId);
		tx.begin();
		try {
			em.remove(dEntity);
			tx.commit();
			System.out.println("removed!!");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
	

}
