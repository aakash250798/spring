package com.akash.spring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/property/config.xml");
		MyDao myDao=(MyDao)ctx.getBean("myDao");
		System.out.println(myDao);
	}
}
