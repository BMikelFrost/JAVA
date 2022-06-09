package com.bree;


public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	

	public void throwSomething() {
		System.out.println("The gorllia threw something!!");
		this.energyLevel -=5;
	
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate a banana.");
		this.energyLevel =+ 10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed up a tree");
		this.energyLevel -= 10;
	}
}

