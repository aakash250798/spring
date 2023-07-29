package com.akash.spring.prescription;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/prescription/config.xml");
		Prescription prescription=(Prescription)ctx.getBean("presc");
		System.out.println(prescription);
	}
}
