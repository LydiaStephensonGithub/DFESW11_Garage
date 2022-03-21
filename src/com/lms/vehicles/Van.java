package com.lms.vehicles;

public class Van extends Vehicle {
	private String size;
	private int payload;
	
	public Van() {
		super();
	}
	
	public Van(int id, String manufacturer, String colour, String size, int payload) {
		super(id, manufacturer, colour);
		this.size = size;
		this.payload = payload;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPayload() {
		return payload;
	}

	public void setPayload(int payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "Size: " + size + " | Payload: " + payload + "\n";
	}
	
}
