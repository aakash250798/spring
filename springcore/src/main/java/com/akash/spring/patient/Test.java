package com.akash.spring.patient;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/patient/config.xml");
		Patient patient=(Patient)ctx.getBean("patient");
		System.out.println(patient);
		ctx.registerShutdownHook(); 
	}
	
}
