package com.daniapp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.daniapp"})
@EntityScan({"com.daniapp"})
public class RpWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpWebApplication.class, args);
	}
}
