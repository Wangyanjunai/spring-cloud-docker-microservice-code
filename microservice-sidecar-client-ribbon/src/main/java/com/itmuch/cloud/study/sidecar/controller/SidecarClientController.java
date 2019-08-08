package com.itmuch.cloud.study.sidecar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SidecarClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/test")
	public String findById() {
		return this.restTemplate.getForObject("http://microservice-sidecar-node-service/", String.class);
	}
}
