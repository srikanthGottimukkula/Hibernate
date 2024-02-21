package in.srikanth.test;

import in.srikanth.dao.CustomerDao;
import in.srikanth.dao.impl.CustomerDaoImpl;
import in.srikanth.entity.Customer;
import in.srikanth.entity.Loan;

public class Tester {

	public static void main(String[] args) {

		CustomerDao daoImpl = new CustomerDaoImpl();

		// save method

		Customer c1 = new Customer();
		c1.setCustomerId(121);
		c1.setCustomerName("srikanth");

		Loan l1 = new Loan();
		l1.setLoanId(1001);
		l1.setLoanName("Insurance");

		c1.setLoan(l1);
		
		Customer c2 = new Customer();
		c2.setCustomerId(111);
		c2.setCustomerName("Ramu");
		c2.setLoan(l1);
		

		daoImpl.saveCustomer(c1);
		daoImpl.saveCustomer(c2);

	}

}
