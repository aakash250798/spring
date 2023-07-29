package com.akash.spring.cardealer;


public class CarDealer {
	private String name;
	private String location;
	private Cars cars;
	/*public CarDealer(String name, String location, Cars cars) {
		super();
		this.name = name;
		this.location = location;
		this.cars = cars;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", location=" + location + ", cars=" + cars + "]";
	}
	
}
