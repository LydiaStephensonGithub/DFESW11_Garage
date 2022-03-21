package com.lms.garage;

import java.util.ArrayList;
import java.util.List;

import com.lms.vehicles.Car;
import com.lms.vehicles.Motorcycle;
import com.lms.vehicles.Van;
import com.lms.vehicles.Vehicle;

public class Garage {
	private List<Vehicle> garage = new ArrayList<Vehicle>();
	
	//add vehicle
	public boolean addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
		return true;
	}
	
	//remove vehicle
	public boolean removeVehicle(int id) {
		for (Vehicle vehicle : getGarage()) {
			if (vehicle.getId() == id) {
				garage.remove(vehicle);
				return true;
			} else {
				continue;
			}
		}
		System.out.println("A vehicle matching that ID not found");
		return false;
	}
	
	//empty garage
	public boolean emptyGarage() {
		getGarage().clear();
		return true;
	}
	
	//fix vehicle
	public int calculateBill() {
		for (Vehicle vehicle : getGarage()) {
			if (vehicle instanceof Car) {
				return 300;
			} else if (vehicle instanceof Van) {
				return 375;
			} else if (vehicle instanceof Motorcycle) {
				return 250;
			}
		}
		return 0;
	}
	
	//remove by type
	public void removeType(String type) {
		List<Vehicle> foundType = new ArrayList<>();
		for (Vehicle v : garage) {
			if (v instanceof Car && type.equals("car")) {
				foundType.add(v);
			}
		}
		for (Vehicle v : foundType) {
			garage.remove(v);
		}
	}
	
	public Garage() {}

	public Garage(List<Vehicle> garage) {
		this.garage = garage;
	}

	public List<Vehicle> getGarage() {
		return garage;
	}

	public void setGarage(List<Vehicle> garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "" + garage;
	}
	
}
