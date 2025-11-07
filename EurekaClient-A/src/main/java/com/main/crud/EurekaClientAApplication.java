package com.main.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientAApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Client A");
		SpringApplication.run(EurekaClientAApplication.class, args);
	}

}
