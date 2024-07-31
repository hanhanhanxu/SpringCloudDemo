package com.example.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGateWayApplication.class, args);
	}

}
