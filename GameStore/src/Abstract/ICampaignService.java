package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	void save(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
