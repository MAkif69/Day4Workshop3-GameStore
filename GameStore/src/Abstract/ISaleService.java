package Abstract;

import Entities.Game;
import Entities.Customer;
import Entities.Campaign;

public interface ISaleService {
    
	public void sale(Game game, Customer customer);
	
	public void saleWithCampain(Game game, Campaign campaign);
}
