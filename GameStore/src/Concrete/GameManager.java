package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void save(Game game) {
		System.out.println("Oyun ekledi : " +game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun sildi : " +game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun güncelledi : " +game.getGameName());
		
	}

}
