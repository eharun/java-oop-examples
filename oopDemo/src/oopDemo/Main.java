package oopDemo;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer(); // Instance creation
		customer.setId(1);
		customer.setCity("Ankara");

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.setTaxNumber("123456789");
		company.setCompanyName("Company Name");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(company);
		customerManager2.save();
		customerManager2.delete();
		
		Person person = new Person();
		person.setFirstName("Name");
		person.setNationalIdentity("12345");
		
		/* Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company(); */
		
	}
}
