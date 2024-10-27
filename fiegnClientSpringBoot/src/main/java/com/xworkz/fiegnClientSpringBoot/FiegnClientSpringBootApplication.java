package com.xworkz.fiegnClientSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FiegnClientSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiegnClientSpringBootApplication.class, args);
	}

}
