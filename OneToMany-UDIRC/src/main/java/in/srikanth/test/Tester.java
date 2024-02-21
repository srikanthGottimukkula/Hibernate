package in.srikanth.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import in.srikanth.dao.ProductDAO;
import in.srikanth.dao.impl.ProductDaoImpl;
import in.srikanth.entity.CategoryEntity;
import in.srikanth.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) throws Exception {

		ProductDAO daoImpl = new ProductDaoImpl();
		
		//save category
		/*
		 * CategoryEntity cate = new CategoryEntity(); cate.setCatergoryid(1120);
		 * cate.setCategoryName("ELECTRONICS");
		 * 
		 * ProductEntity pe1 = new ProductEntity(); pe1.setProductId(100);
		 * pe1.setProductName("Mobile");
		 * 
		 * File file1 = new
		 * File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\images\\Mobile1.jpg"
		 * ); byte[] imageBytes = new byte[(int)file1.length()]; FileInputStream fis =
		 * new FileInputStream(file1); fis.read(imageBytes);
		 * 
		 * pe1.setProductImage(imageBytes);
		 * 
		 * ProductEntity pe2 = new ProductEntity(); pe2.setProductId(101);
		 * pe2.setProductName("TV");
		 * 
		 * File file2 = new
		 * File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\images\\Tv1.jpg"
		 * ); byte[] imageBytes2 = new byte[(int)file2.length()]; FileInputStream fis2 =
		 * new FileInputStream(file2); fis2.read(imageBytes2);
		 * 
		 * pe2.setProductImage(imageBytes2);
		 * 
		 * ProductEntity pe3 = new ProductEntity(); pe3.setProductId(103);
		 * pe3.setProductName("Fridge");
		 * 
		 * File file3 = new
		 * File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\images\\Fridge1.jpg"
		 * ); byte[] imageBytes3 = new byte[(int)file3.length()]; FileInputStream fis3 =
		 * new FileInputStream(file3); fis3.read(imageBytes3);
		 * 
		 * pe3.setProductImage(imageBytes3);
		 * 
		 * List<ProductEntity> listOfProd = Arrays.asList(pe1,pe2,pe3);
		 * 
		 * cate.setLstOfProducts(listOfProd); daoImpl.saveCategory(cate);
		 */
		
		/*
			* fetch the products
		*/
		
//			CategoryEntity cEntity = daoImpl.fetchCategory(1120);
//			System.out.println("category Name:"+cEntity.getCategoryName());
//			
//			List<ProductEntity> list = cEntity.getLstOfProducts();
//			ProductEntity pEntity = list.get(0);
//			System.out.println("Product Id:"+pEntity.getProductId());
//			System.out.println("Product Name:"+pEntity.getProductName());
//			byte[] bytesOfImage = pEntity.getProductImage();
//			File file = new File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\ImageFromDB\\Mobile1.jpg");
//			FileOutputStream fos = new FileOutputStream(file);
//			fos.write(bytesOfImage);
//			System.out.println("please check the image:"+file.getAbsolutePath());
			
			//fis "read" fos-->"write"
			
			/*
			 * remove Category
			*/
		
			daoImpl.removeCategory(1120);
			
			
		
	}

}
