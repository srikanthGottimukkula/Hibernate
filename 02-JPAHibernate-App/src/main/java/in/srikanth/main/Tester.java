package in.srikanth.main;

import in.srikanth.dao.ProductDao;
import in.srikanth.dao.Impl.ProductDAOImpl;
import in.srikanth.entity.ProductEntity;

public class Tester {
	public static void main(String[] args) {

		// save product

		/*
		 * ProductDao daoImpl = new ProductDAOImpl();
		 * 
		 * ProductEntity product = new ProductEntity(); product.setProductId(120);
		 * product.setProductName("Apple"); product.setQuantity(5);
		 * product.setUnitPrice(2000.0);
		 * 
		 * daoImpl.saveProduct(product);
		 */

		// loadProduct
		
		/*
		 * ProductDao daoImpl = new ProductDAOImpl(); ProductEntity loadProduct =
		 * daoImpl.loadProduct(121);
		 * System.out.println(loadProduct.getProductName()+" ---- "+loadProduct.
		 * getUnitPrice());
		 */
		 

		// UpdateProductById
		/*
		 * ProductDao daoImpl = new ProductDAOImpl(); daoImpl.updateProductById(121,
		 * 500.0);
		 */

		// DeleteById
		/*
		 * ProductDao daoImpl = new ProductDAOImpl(); daoImpl.deleteProductById(121);
		 */

		ProductDao daoImpl = new ProductDAOImpl();
		daoImpl.testEntityStates();
	}
}
