package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(DependencyApplication.class, args);
	Customer c = context.getBean(Customer.class); //trying to get class object
	c.display();
	}

}
