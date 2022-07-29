package Adaptors;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.copy.KPSPublicSoapProxy;

public class MernisCheck implements CustomerCheckService{
	


	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {

		
				
		
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy kpsPublicSoapProxy=new tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy();
		boolean result =false;
		try {
		result= kpsPublicSoapProxy.TCKimlikNoDogrula(
		
				Long.parseLong(customer.getNationalNumber()) 
				,customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getBirthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());

		
	} catch (RemoteException e) {


		e.printStackTrace();
}
		return result;
}
	
}
