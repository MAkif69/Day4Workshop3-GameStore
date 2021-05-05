package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	
	public int Id;
	public String firstName;
	public String lastName;
	public String NationalityId;
	public Date DateOfBirth;
	
	
	public Customer(int id, String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		
		this.Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.NationalityId = nationalityId;
		this.DateOfBirth = dateOfBirth;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
}
