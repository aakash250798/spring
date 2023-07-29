package com.akash.spring.cardealer;

import java.util.List;

public class Cars {
	private List<String> carName;

	/*public Cars(List<String> carName) {
		super();
		this.carName = carName;
	}*/

	public List<String> getCarName() {
		return carName;
	}

	public void setCarName(List<String> carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Cars [carName=" + carName + "]";
	}

}
