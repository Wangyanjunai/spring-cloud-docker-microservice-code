package com.itmuch.cloud.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DiscoveryEurekaApplication.class);
	
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaApplication.class, args);
        LOGGER.info("The microsoft service discovery eureka application has bean started...");
    }

}
