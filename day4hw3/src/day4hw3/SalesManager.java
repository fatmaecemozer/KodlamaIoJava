package day4hw3;

public class SalesManager implements SalesService{

	@Override
	public void sale(Customer customer, Campaign campaign) {

		System.out.println("Game buyer is: " + customer.firstName + " " + campaign.name);
		
	}

}
