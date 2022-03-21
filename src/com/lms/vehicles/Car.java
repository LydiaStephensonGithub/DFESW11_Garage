package com.lms.vehicles;

public class Car extends Vehicle {
	private String model;
	private int seats;
	
	public Car() {
		super();
	}
	
	public Car(int id, String manufacturer, String colour, String model, int seats) {
		super(id, manufacturer, colour);
		this.model = model;
		this.seats = seats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "Model: " + model + " | Seats: " + seats + "\n";
	}	
	
}
