import java.util.GregorianCalendar;

import Abstracts.CustomerCheckService;
import Abstracts.CustomerManager;
import Abstracts.CustomerService;
import Adaptors.MernisCheck;
import Concrete.NeroManager;
import Concrete.StarbucksManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
	

		Customer customer1=new Customer();
		customer1.setId(1);
		customer1.setFirstName("meliha");
		customer1.setLastName("duman");
		customer1.setNationalNumber("30095068258");
		customer1.setBirthday(new GregorianCalendar (1996,05,05).getTime());
		

		
		CustomerManager customerManager =new StarbucksManager(new MernisCheck());
		customerManager.add(customer1);
	}
	
	
	
	

}
