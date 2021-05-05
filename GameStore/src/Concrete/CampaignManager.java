package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println("Kampanya ekledi : " +campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi : " +campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi : " +campaign.getCampaignName());
		
	}

}
