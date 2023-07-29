package com.cecwebsolutions.zoo;

public abstract class Animal {
	//Fields 
	protected String name;
	
	
	
	public Animal(String name) {
		this.name=name;
	}
	
	//Non-abstract method
	public void breathe() {
		System.out.println(this.name+ "is breathing");
	}
	
	
	//Abstract method
	public abstract void eat(); 
	
	
}
