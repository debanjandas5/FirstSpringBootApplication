package com.debanjan.springbootfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting my first SpringBoot Application");
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
