package Abstract;

import Entities.Game;

public interface IGameService {
	void save(Game game);
	void update(Game game);
	void delete(Game game);
}
