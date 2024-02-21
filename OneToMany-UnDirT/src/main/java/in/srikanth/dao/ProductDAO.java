package in.srikanth.dao;

import in.srikanth.entity.CategoryEntity;

public interface ProductDAO {

	void saveCategory(CategoryEntity entity);

	CategoryEntity fetchCategory(Integer categoryId);

	void removeCategory(Integer categoryId);
}
