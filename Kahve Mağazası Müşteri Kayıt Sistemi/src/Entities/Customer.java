package Entities;
import java.util.Date;

public class Customer  {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalNumber;
	Date birthday;
	
	
	public Customer(int id, String firstName, String lastName, String nationalNumber, Date birthday) {
		
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalNumber = nationalNumber;
		this.birthday = birthday;
	}


	public Customer() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalNumber() {
		return nationalNumber;
	}


	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
