package com.curso.apiDEV8.domain;

public class Weather {

	private int temp;
	private String description;
	private Location location;
	
	public Weather() {
		
	}
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	//toString
	
}
