package in.srikanth.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import in.srikanth.dao.CatDao;
import in.srikanth.daoImpl.CatDaoImpl;
import in.srikanth.entity.CatEntity;
import in.srikanth.entity.DogEntity;

public class Tester {
	public static void main(String[] args) throws Exception {

		CatDao daoImpl = new CatDaoImpl();

		DogEntity entity = new DogEntity();
		entity.setDogId(100);
		entity.setDogName("lab");


		CatEntity catEntity1 = new CatEntity();
		catEntity1.setCatId(1);
		catEntity1.setCatName("meow");

		File file1 = new File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\images\\cat1.jpg");
		byte[] catImage1 = new byte[(int)file1.length()];
		FileInputStream fis = new FileInputStream(file1);
		fis.read(catImage1);
		catEntity1.setCatImage(catImage1);



		CatEntity catEntity = new CatEntity();
		catEntity.setCatId(2);
		catEntity.setCatName("hjdg");

		File file2 = new File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\images\\cat2.jpg");
		byte[] catImage2 = new byte[(int)file2.length()];
		FileInputStream fis1 = new FileInputStream(file2);
		fis1.read(catImage2);
		catEntity.setCatImage(catImage2);

		List<CatEntity> list = Arrays.asList(catEntity1,catEntity);
		entity.setLstOfCats(list);
		daoImpl.saveDog(entity);

//		DogEntity fetchDogId = daoImpl.fetchDogId(100);
//		System.out.println("Dog Name is:" +fetchDogId.getDogName());
//		List<CatEntity> lstOfCats = fetchDogId.getLstOfCats();
//		CatEntity catEntity = lstOfCats.get(1);
//		System.out.println("cat id:" + catEntity.getCatId());
//		System.out.println("cat name is :" + catEntity.getCatName());
//
//		byte[] catImage = catEntity.getCatImage();
//		File file = new File("D:\\Full Stack Developer\\Backend\\PracticeIT\\HibernateIT\\ImageFromDB\\cat1.jpg");
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write(catImage);
//		System.out.println("please check image:" + file.getAbsolutePath());

		
//			daoImpl.RemoveDog(100);
	}
}
