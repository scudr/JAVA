package com.cecwebsolutions.zoo;

public class Bird extends Animal implements Flyable{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this.name+ " is flying");
		
	}

	@Override
	public void eat() {
		System.out.println(this.name+ " is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println(this.name+ " is sleeping");
		
	}

}
