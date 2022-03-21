package com.lms.vehicles;

public class Motorcycle extends Vehicle {
	private String type;
	private boolean helmet_included;
	
	public Motorcycle() {
		super();
	}
	
	public Motorcycle(int id, String manufacturer, String colour, String type, boolean helmet_included) {
		super(id, manufacturer, colour);
		this.type = type;
		this.helmet_included = helmet_included;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHelmet_included() {
		return helmet_included;
	}

	public void setHelmet_included(boolean helmet_included) {
		this.helmet_included = helmet_included;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "Type: " + type + " | Helmet Included: " + helmet_included + "\n";
	}
	
}
