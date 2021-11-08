package com.management.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodTrayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTrayServiceApplication.class, args);
	}

}
