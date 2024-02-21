package in.srikanth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_loan")
@Entity
public class Loan {

	@Id
	@Column(name = "L_ID")
	private Integer loanId;
	@Column(name = "L_Name")
	private String loanName;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanName=" + loanName + "]";
	}

}