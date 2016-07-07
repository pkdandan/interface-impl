package com.provider.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) throws IOException {
		String configLocation="classpath:spring/spring-context.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		applicationContext.start();
		System.out.println("press any key to exit.");
		System.in.read();
	}
}
