package com.springboot.initializer.MyBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBootAppApplication.class, args);
		System.out.println("hello sravani");
	}

}
