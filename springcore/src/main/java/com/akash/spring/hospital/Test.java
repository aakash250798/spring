package com.akash.spring.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext ("com/akash/spring/hospital/config.xml");
		Hospital hospital=(Hospital)ctx.getBean("hospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
	}
}
  