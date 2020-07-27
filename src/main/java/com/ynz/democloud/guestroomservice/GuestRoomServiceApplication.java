package com.ynz.democloud.guestroomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GuestRoomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuestRoomServiceApplication.class, args);
	}

}
