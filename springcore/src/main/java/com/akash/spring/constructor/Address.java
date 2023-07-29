package com.akash.spring.constructor;

public class Address {
	private int hno;
	private String street;
	private String city;
	public String getCity() {
		return city;
	}
	Address(int hno,String street, String city){
		this.hno=hno;
		this.city=city;
		this.street=street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}

}
