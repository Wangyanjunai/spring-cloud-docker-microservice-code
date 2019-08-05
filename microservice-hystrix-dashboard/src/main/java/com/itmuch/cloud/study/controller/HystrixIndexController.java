package com.itmuch.cloud.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HystrixIndexController {

	@GetMapping(value = "")
	public String index() {
		return "forward:/hystrix";
	}
}
