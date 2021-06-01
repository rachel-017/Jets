package com.skilldistillery.jets.entity;

public class Wasp extends Jet implements PollenPocket, CombatReady{

	public Wasp() {
		super();
	}

	public Wasp(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void gatherPollen() {
		System.out.println("zzz.. nectar found ..zzz.. Pollen Gathered");
	}
	public void fight() {
		System.out.println("Enemy is Stung and Paralized");
	}
}
