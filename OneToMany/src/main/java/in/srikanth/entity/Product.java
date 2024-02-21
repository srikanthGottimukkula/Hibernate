package in.srikanth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_product")
public class Product {
	
	@Id
	@Column(name="P_ID")
	private Integer productId;
	@Column(name="P_NAME")
	private String productName;
	

}
