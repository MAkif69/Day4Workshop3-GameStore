package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService{

	 private ICustomerCheckService customerCheckService;
	
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if (this.customerCheckService.CheckIfRealPerson(customer))
        {
			System.out.println("M��teri eklendi : " +customer.getFirstName());
        }else {
			System.out.println("Not a valid person ");
		}
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi : "+customer.getFirstName() +customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : "+customer.getFirstName() +customer.getLastName());
		
	}


}
