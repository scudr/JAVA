package com.cecwebsolutions.zoo.application;

import com.cecwebsolutions.zoo.controller.ZooController;
import com.cecwebsolutions.zoo.service.ZooService;

public class ZooApp {

	public static void main(String[] args) {

		ZooService zooService = new ZooService();
        ZooController zooController = new ZooController(zooService);

        zooController.createAndDisplayMammal("Lion", "Leo");
        zooController.createAndDisplayMammal("Human", "Tom");
		

	}
	

}
