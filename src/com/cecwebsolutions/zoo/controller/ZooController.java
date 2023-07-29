package com.cecwebsolutions.zoo.controller;

import com.cecwebsolutions.zoo.Mammal;
import com.cecwebsolutions.zoo.Swimmable;
import com.cecwebsolutions.zoo.service.ZooService;

public class ZooController {
	private ZooService zooService;

	public ZooController(ZooService zooService) {
		this.zooService = zooService;
	}
	
	
	public void createAndDisplayMammal(String type, String name) {
		
		Mammal mammal = zooService.createMammal(type, name);
		
		mammal.eat();
		mammal.sleep();
		
		if (mammal instanceof Swimmable) {
            ((Swimmable) mammal).swim();
        }
	}

}
