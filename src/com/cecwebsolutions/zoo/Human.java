package com.cecwebsolutions.zoo;

public class Human extends Mammal implements Carnivore{

	public Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatMeat() {
		System.out.println(this.name+" is eating meat all the time.");
		
	}

	@Override
	public void eat() {
		System.out.println(this.name+" is eating all the time ");
		
	}

}
