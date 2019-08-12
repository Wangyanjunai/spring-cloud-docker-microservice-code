package com.itmuch.cloud.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigClientApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
		LOGGER.info("The microsoft service config client application has bean started...");
	}

}
