package com.beantemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringDemo {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("app-conf-2.xml");
		Elephant elephant=(Elephant)context.getBean("elephant");
		System.out.println(elephant.getLocation());
		System.out.println(elephant.getName());
		System.out.println(elephant.getAge());
    	context.registerShutdownHook();
	}
} 