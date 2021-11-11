package com.curso.apiDEV8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.curso.apiDEV8.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
public class ApiDev8Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiDev8Application.class, args);
	}

}
