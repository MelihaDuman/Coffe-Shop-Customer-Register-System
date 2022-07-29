package Concrete;

import Abstracts.CustomerCheckService;
import Abstracts.CustomerManager;
import Abstracts.CustomerService;
import Entities.Customer;

public class StarbucksManager extends CustomerManager implements CustomerCheckService{

	CustomerCheckService customerCheckService;
	
	public StarbucksManager (CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
		}
	
	public void add (Customer customer ) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer))
		{
			super.add(customer);
		
		}else
		
		throw new Exception ("not a valid person");
	
	
	
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
