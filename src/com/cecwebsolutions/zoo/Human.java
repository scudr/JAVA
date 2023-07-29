package com.cecwebsolutions.zoo;

public class Human extends Mammal implements Herbivore, Carnivore, Swimmable{

	public Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	

   public void eatPlants() {
        System.out.println(this.name + " eats plants.");
    }


	@Override
	public void eatMeat() {
		System.out.println(this.name+" is eating meat all the time.");
		
	}

	@Override
	public void eat() {
		System.out.println(this.name+" is eating all the time ");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
