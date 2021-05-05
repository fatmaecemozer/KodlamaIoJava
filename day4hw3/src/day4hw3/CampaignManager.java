package day4hw3;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added " + campaign.name);
	}

	@Override
	public double update(Campaign campaign) {

		double finalPrice = campaign.price-campaign.discount;
		return finalPrice;
	}

	@Override
	public void delete(Campaign campaign) {

		
	}

}
