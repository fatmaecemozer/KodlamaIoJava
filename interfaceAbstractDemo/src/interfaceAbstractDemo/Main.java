package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		customer.dateOfBirth = "1985";
		customer.firstName = "Engin";
		customer.lastName = "Demiroð";
		customer.nationalityId = "12345";
		customer.id = 1;
		customerManager.save(customer);
	}

}
