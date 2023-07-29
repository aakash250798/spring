package com.akash.spring.constructor.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akash.spring.constructor.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/constructor/ambiguity/config.xml");
		Addition add=(Addition)ctx.getBean("addition");
		System.out.println(add);
	} 

}
