package com.skilldistillery.jets.entity;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet() {}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Flyer Type: " + model + ", Max Speed: " + speed + ", Max Range: " + range + ", Price: " + price + ".";
	}

	public void fly() {
		System.out.println("Flyer Type: " + this.model + ", Max Speed: " + this.speed + ", Max Range: " + this.range
				+ ", Cost: " + this.price + ", Max AirTime:"+(this.range/this.speed));
	}
	public double getSpeedInMach(double speed) {
		double speedInMach = this.speed/767;
		return speedInMach;
	}

}
