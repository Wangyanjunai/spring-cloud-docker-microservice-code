package com.itmuch.cloud.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ZipkinServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
		LOGGER.info("The microsoft zipkin server service application has bean started...");
	}
}
