package in.srikanth.dao;

import in.srikanth.entity.StudentCompositeKey;
import in.srikanth.entity.StudentEntity;

public interface StudentDAO {

	void saveStudent(StudentEntity stdEntity);

	StudentEntity fetchStudent(StudentCompositeKey compositeKey);

}
