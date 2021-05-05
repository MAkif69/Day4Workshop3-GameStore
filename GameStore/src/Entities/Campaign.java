package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity{
	int Id;
	String campaignName;
	int discountRate;
	
	
	
	public Campaign(int id, String campaignName, int discountRate) {
		
		Id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
}
