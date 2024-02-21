package in.srikanth.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.srikanth.dao.ProductDao;
import in.srikanth.entity.ProductEntity;

public class ProductDAOImpl implements ProductDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println("Product inserted into db!!");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Error inserting the Product!!");
		} finally {
			entityManager.close();
		}
		return product;
	}

	@Override
	public ProductEntity loadProduct(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);
		entityManager.close();
		return productEntity;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double unitPrice) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);
		tx.begin();
		productEntity.setUnitPrice(unitPrice);
		tx.commit();
		entityManager.close();
		System.out.println("Product updated successfully!!");
		return productEntity;
	}

	@Override
	public void deleteProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);
		tx.begin();
		entityManager.remove(productEntity);
		tx.commit();
		entityManager.close();
		System.out.println("product removed !!");
	}

	@Override
	public void testEntityStates() {
		EntityManager entityManager = factory.createEntityManager();
		/*
		 * ProductEntity pe = new ProductEntity(); pe.setProductId(100);
		 * pe.setProductName("Realme"); pe.setQuantity(12); pe.setUnitPrice(200.00);
		 */
		ProductEntity pe = entityManager.find(ProductEntity.class, 100);
		/*
		 * EntityTransaction tx = entityManager.getTransaction(); tx.begin();
		 * entityManager.persist(pe); //persistent state tx.commit();
		 */		
		entityManager.detach(pe);    // detached state
		pe.setUnitPrice(210.00);	// The changes made to an entity in detached state does not effect.
		
		EntityTransaction tx = entityManager.getTransaction();
		
		tx.begin();
		entityManager.merge(pe);
		tx.commit();
		
		entityManager.close();

	

	}
	
//	@Override
//	public void testEntityStates1() {
//		EntityManager entityManager = factory.createEntityManager();
//		tx.begin();
//		entityManager.detach(pe);    // detached state
//		pe.setUnitPrice(210.00);
//
//		entityManager.close();
//		
//	}

}
