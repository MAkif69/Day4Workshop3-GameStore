import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"Muhammed Akif","HAÞLAK","*",new Date(1,1,1));//Size ait TC ve doðum tarihi bilgierni girmeniz haline çalýþacaktýr.
		Campaign campaign = new Campaign(1,"Bayram Ýndirimi",50);
		Game game = new Game(1,"PUBG",120);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		System.out.println("------------------------------------------");
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.save(campaign);
		
		System.out.println("------------------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.save(game);
		
		System.out.println("------------------------------------------");
		
		SaleManager saleManager = new SaleManager(new CampaignManager());
		saleManager.sale(game, customer);
	
		
	}

}
