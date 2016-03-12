package com.daniapp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.daniapp.controller", "com.daniapp.application", "com.daniapp.model"})
public class RpWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpWebApplication.class, args);
	}
}
