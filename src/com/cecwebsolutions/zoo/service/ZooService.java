package com.cecwebsolutions.zoo.service;

import com.cecwebsolutions.zoo.Human;
import com.cecwebsolutions.zoo.Lion;
import com.cecwebsolutions.zoo.Mammal;

public class ZooService {

	public Mammal createMammal(String type, String name) {
		if ("Lion".equals(type)) {
			return new Lion(name);
		} else if ("Human".equals(type)) {
			return new Human(name);
		} else {
			throw new IllegalArgumentException("Invalid mammal type: " + type);
		}
	}
}
