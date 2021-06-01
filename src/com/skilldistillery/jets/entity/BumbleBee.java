package com.skilldistillery.jets.entity;

public class BumbleBee extends Jet implements PollenPocket{
	
	public BumbleBee() {
		super();
	}
	public BumbleBee(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void gatherPollen() {
		System.out.println("Bzz...bzz... Pollen Gathered!");
	}

}
