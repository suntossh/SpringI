package com.infiniteskills.apps.ioc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.di.DigitalMediaLocator;
import com.infiniteskills.spring.di.RentalLocation;
import com.infiniteskills.spring.di.RentalService;

public class AdminConsole {

	private static final String TITLE = "Forest Gump";

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalService rentalService = null;
		rentalService = context.getBean("rentalService", RentalService.class);
		List<RentalLocation> locations = rentalService.find(TITLE, "16802", 10);
		System.out.println("rentalService");
		for(RentalLocation rl: locations){
			System.out.println(rl);
		}
		
		rentalService = null;
		rentalService = context.getBean("digitalMediaRentalService", RentalService.class);
		locations = null;
		locations = rentalService.find(TITLE, "16802", 10);
		
		
		System.out.println("digitalMediaRentalService");
		for(RentalLocation rl: locations){
			System.out.println(rl);
		}
		
		
		//Allow admins to support customers
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
