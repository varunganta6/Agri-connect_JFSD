package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {"com.example.demo"})
@ComponentScan(basePackages = {"com.example.demo.Controller"})
@ComponentScan(basePackages = {"com.example.demo.Model"})
@ComponentScan(basePackages = {"com.example.demo.Repository"})
@ComponentScan(basePackages = {"com.example.demo.Service"})
public class MySdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySdpApplication.class, args);
	}

}
