package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Checked");
		}else {
			System.out.println("not a valid person");
		}
	}
	
	
}
