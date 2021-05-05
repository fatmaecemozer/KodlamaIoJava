package day4hw3;

public class Main {

	public static void main(String[] args) {

		
		CustomerService customerManager = new CustomerManager(new ValidationManager());
		Customer customer = new Customer();
		customer.id = 1;
		customer.nationalityNumber = "12345";
		customer.firstName = "Ecem";
		customerManager.add(customer);
		
		CampaignService campaignManager = new CampaignManager();
		Campaign campaign = new Campaign();
		campaign.price = 1000;
		campaign.discount = campaign.price*0.10;
		campaign.name = "Campaign: 10% discount";
		
		SalesService salesManager = new SalesManager();
		salesManager.sale(customer, campaign);
		
		System.out.println(campaignManager.update(campaign) + " updated price according to campaign");

	}

}
