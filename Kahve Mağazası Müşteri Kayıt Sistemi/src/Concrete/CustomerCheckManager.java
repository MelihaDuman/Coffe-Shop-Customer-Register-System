package Concrete;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public abstract class CustomerCheckManager implements CustomerCheckService {
	
	public boolean CheckIfRelPerson(Customer customer ) {
		return true;
		
	}

}
