package com.calpullix.actuator.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class ActuatorAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorAdminApplication.class, args);
	}

}
