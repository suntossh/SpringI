package com.infiniteskills.apps.factory;

import java.util.List;

import com.infiniteskills.spring.di.RentalLocation;
import com.infiniteskills.spring.di.RentalService;

public class CustomerWebsite {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		RentalService rentalService = new RentalService(DigitalMediaLocatorFactory.createInstance());
		
		List<RentalLocation> locations = rentalService.find("Jaws", "16802", 10);
		
		for(RentalLocation rl : locations){
			System.out.println(rl);
		}
	}
}
