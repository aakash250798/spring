package com.akash.spring.languages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/akash/spring/languages/config.xml");
		Languages lang=(Languages)ctx.getBean("lang");
		System.out.println(lang);
	}

}
