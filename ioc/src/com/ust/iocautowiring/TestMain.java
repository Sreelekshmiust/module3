package com.ust.iocautowiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	new ClassPathXmlApplicationContext("beans.xml");
		B b =(B)context.getBean("b");
		
		context.registerShutdownHook();
	}

}
