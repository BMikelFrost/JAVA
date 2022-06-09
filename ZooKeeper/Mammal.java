package com.bree;

public class Mammal {
	protected int energyLevel = 100;

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public Mammal() {
		
	}

	public int displayenergyLevel() {
		System.out.printf("Energy Level: %d", energyLevel);
				return energyLevel;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}

