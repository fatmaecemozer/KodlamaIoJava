package day4hw3;

public class ValidationManager implements ValidationService{

	@Override
	public boolean checkEdevlet(Customer customer) {
		if(customer.id == 1 && customer.nationalityNumber == "12345") {
			System.out.println("Validation is complete");
			return true;
		}else {
			System.out.println("Invalid customer");
			return false;
		}
	}

}
