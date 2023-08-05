package com.example.allyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AllyserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(AllyserverApplication.class, args);
	}

}
