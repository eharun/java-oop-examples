package oopDemo;

public class CustomerManager {
	private Customer _customer;
	public CustomerManager(Customer customer) {
		_customer = customer;
	}
	public void save() {
		System.out.println("Customer has been saved. ID: " + _customer.getId());
	}
	public void delete() {
		System.out.println("Customer has been deleted. ID: " + _customer.getId());
	}
}
