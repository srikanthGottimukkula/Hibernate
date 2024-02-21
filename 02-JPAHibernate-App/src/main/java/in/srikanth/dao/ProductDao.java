package in.srikanth.dao;

import in.srikanth.entity.ProductEntity;

public interface ProductDao {
	
	ProductEntity saveProduct(ProductEntity product);
	ProductEntity loadProduct(Integer productId);
	ProductEntity updateProductById(Integer productId, Double unitPrice);
	void deleteProductById(Integer productId);
	
	void testEntityStates();
//	void testEntityStates1();

}
