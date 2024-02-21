package in.srikanth.dao;

import in.srikanth.entity.DogEntity;

public interface CatDao {
	
	void saveDog(DogEntity entity);
	
	DogEntity fetchDogId(Integer dogId);
	
	void RemoveDog(Integer dogId);
	

}
