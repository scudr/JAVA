package com.cecwebsolutions.zoo;

public abstract class Mammal extends Animal implements Herbivore{

	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void eatPlants() {
		System.out.println(this.name+ " is eating plants");
	}
	
	
}
