package in.srikanth.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dog")
public class DogEntity {
	
	@Id
	@Column(name="dog_id")
	private Integer dogId;
	@Column(name="dog_name")
	private String dogName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="dogId")
	private List<CatEntity> lstOfCats;

	@Override
	public String toString() {
		return "DogEntity [dogId=" + dogId + ", dogName=" + dogName + ", lstOfCats=" + lstOfCats + "]";
	}

	public Integer getDogId() {
		return dogId;
	}

	public void setDogId(Integer dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public List<CatEntity> getLstOfCats() {
		return lstOfCats;
	}

	public void setLstOfCats(List<CatEntity> lstOfCats) {
		this.lstOfCats = lstOfCats;
	}
	
	

}
