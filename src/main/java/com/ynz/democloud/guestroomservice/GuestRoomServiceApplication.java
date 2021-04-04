package com.ynz.democloud.guestroomservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class GuestRoomServiceApplication {

    public static void main(String[] args) {
    	log.info("Room domain micro-service:  ");
        SpringApplication.run(GuestRoomServiceApplication.class, args);
    }

}
