package Abstracts;

import Entities.Customer;

public class CustomerManager implements CustomerService {

	

	public void add (Customer customer) throws Exception {
		System.out.println(customer.getFirstName()+" eklendi");
	}
}
