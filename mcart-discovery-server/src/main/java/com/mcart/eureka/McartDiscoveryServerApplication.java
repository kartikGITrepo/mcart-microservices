package com.mcart.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McartDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McartDiscoveryServerApplication.class, args);
	}

}
