package com.cecwebsolutions.zoo;

public class Lion extends Mammal{

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is eating");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is sleeping ");
	}

}
