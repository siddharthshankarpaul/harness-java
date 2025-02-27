package com.sid.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		if(1==1) {
			throw new RuntimeException("I won't run today");
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
