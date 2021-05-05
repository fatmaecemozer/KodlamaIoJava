package day4hw3;

public class CustomerManager implements CustomerService{

	private ValidationService validationService;
	
	public CustomerManager(ValidationService validationService) {
		this.validationService = validationService;
	}
	
	@Override
	public void add(Customer customer) {
		if(validationService.checkEdevlet(customer)==true) {
			System.out.println("Customer added");
		}else {
			System.out.println("Customer could not be added");
		}
	}
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
