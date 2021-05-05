package Concrete;

import Abstract.ICampaignService;
import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements ISaleService {

	private ICampaignService campaignService;
	
	
	public SaleManager(ICampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Game game, Customer customer) {
		System.out.println(game.getGameName() + " Ýsimli oyun " +customer.firstName + " Ýsimli kiþiye satýlmýþtýr..." );
		
	}

	@Override
	public void saleWithCampain(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " " + campaign.getDiscountRate());
		
	}

}
