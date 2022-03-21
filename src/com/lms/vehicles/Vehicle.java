package com.lms.vehicles;

public abstract class Vehicle {
	private int id;
	private String manufacturer;
	private String colour;
	
	//default constructor
	public Vehicle() {}
	
	//all arguments constructor
	public Vehicle(int id, String manufacturer, String colour) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.colour = colour;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle ID: " + id + " | Manufacturer: " + manufacturer + " | Colour: " + colour + " | "; 
	}

}
