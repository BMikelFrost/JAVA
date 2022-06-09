package com.bree;

public class Bat extends Mammal {

	
	public Bat() {
		super(300);
		

	}
	
	
	public void fly() {
		System.out.println("Flying sound!!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		
	}
	
	public void attackTown() {
		System.out.println("Crackle sounds.");
		this.energyLevel -= 100;
	}
}
