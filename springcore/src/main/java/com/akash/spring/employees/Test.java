package com.akash.spring.employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/employees/config.xml");
		Bean bean=(Bean)ctx.getBean("bean");
		System.out.println(bean.getDbPort()+"\n"+bean.getDbUrl()+"\n"+bean.getDbUserName());
	}

}
