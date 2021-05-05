package Entities;

import Abstract.IEntity;

public class Game implements IEntity {
	
	int Id;
	String gameName;
	int unitPrice;
	
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, int unitPrice) {
		
		this.Id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		unitPrice = unitPrice;
	}
	
	
}
