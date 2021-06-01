package com.skilldistillery.jets.entity;

public class RhinoBeetle extends Jet implements CombatReady{

	public RhinoBeetle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RhinoBeetle(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void fight() {
		System.out.println("Enemy is Flipped and Debilitated");
	}

}
