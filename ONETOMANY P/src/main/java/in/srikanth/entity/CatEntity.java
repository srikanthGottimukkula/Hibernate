package in.srikanth.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="cat")
public class CatEntity {
	
	@Id
	@Column(name="cat_id")
	private Integer catId;
	
	@Column(name="cat_name")
	private String catName;
	
	@Lob
	@Column(name="cat_image")
	private byte[] catImage;

	public byte[] getCatImage() {
		return catImage;
	}

	public void setCatImage(byte[] catImage) {
		this.catImage = catImage;
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "CatEntity [catId=" + catId + ", catName=" + catName + ", catImage=" + Arrays.toString(catImage) + "]";
	}

	
	
}
