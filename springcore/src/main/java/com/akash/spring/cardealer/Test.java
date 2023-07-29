package com.akash.spring.cardealer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/cardealer/config.xml");
		CarDealer cardealer=(CarDealer) ctx.getBean("cardealer");
		System.out.println(cardealer);
		//((AbstractApplicationContext) ctx).close();
	}

}
