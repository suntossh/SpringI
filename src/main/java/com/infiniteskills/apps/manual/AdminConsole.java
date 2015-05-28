package com.infiniteskills.apps.manual;

import java.util.List;

import com.infiniteskills.spring.di.DigitalMediaLocator;
import com.infiniteskills.spring.di.KioskLocator;
import com.infiniteskills.spring.di.RentalLocation;
import com.infiniteskills.spring.di.RentalService;
import com.infiniteskills.spring.di.StoreLocator;

public class AdminConsole {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		RentalService rentalService = new RentalService(new KioskLocator("key"));
//		RentalService rentalService = new RentalService(new StoreLocator());
//		RentalService rentalService = new RentalService(new DigitalMediaLocator());
		List<RentalLocation> locations = rentalService.find("Forest Gump", "16802", 10);
		
		for(RentalLocation rl : locations){
			System.out.println(rl);
		}
		
		//Allow admins to support customers
		
	}
}
