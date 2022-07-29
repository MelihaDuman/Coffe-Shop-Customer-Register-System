package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerService  {

	public void add (Customer customer ) throws RemoteException, Exception; 
		


}
