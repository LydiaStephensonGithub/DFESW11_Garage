package com.lms;

import com.lms.garage.Garage;
import com.lms.vehicles.Car;
import com.lms.vehicles.Motorcycle;
import com.lms.vehicles.Van;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Car vehicle1 = new Car(1, "Fiat", "Purple", "Hatchback", 4);
		Car vehicle2 = new Car(2, "BMW", "Blue", "SUV", 6);
		Car vehicle3 = new Car(3, "Bentley", "Red", "Sports", 4);
		Van vehicle4 = new Van(4, "Mitsubishi", "Green", "Medium", 1200);
		Van vehicle5 = new Van(5, "Ford", "White", "Large", 1500);
		Van vehicle6 = new Van(6, "Mitsubishi", "Black", "Medium", 1200);
		Motorcycle vehicle7 = new Motorcycle(7, "Ducati", "Yellow", "Sports", true);
		Motorcycle vehicle8 = new Motorcycle(8, "Harley", "Red", "Cruiser", true);
		Motorcycle vehicle9 = new Motorcycle(9, "Harley", "Black", "Cruiser", false);
		
		garage.addVehicle(vehicle1);
		garage.addVehicle(vehicle2);
		garage.addVehicle(vehicle3);
		garage.addVehicle(vehicle4);
		garage.addVehicle(vehicle5);
		garage.addVehicle(vehicle6);
		garage.addVehicle(vehicle7);
		garage.addVehicle(vehicle8);
		garage.addVehicle(vehicle9);
		
		//System.out.println(garage.calculateBill());
		//garage.removeVehicle(1);
		//garage.emptyGarage();
		//garage.removeType("car");
		System.out.println(garage);
		
		
	}
}
