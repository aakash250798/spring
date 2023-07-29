package com.akash.spring.patient;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient  {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside INIT");
	}
	

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy");
	}
	

}
