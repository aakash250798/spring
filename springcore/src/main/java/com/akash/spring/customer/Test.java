package com.akash.spring.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/customer/config1.xml");
		Customer customer=(Customer) ctx.getBean("cust");
		System.out.println(customer);
	}
}
