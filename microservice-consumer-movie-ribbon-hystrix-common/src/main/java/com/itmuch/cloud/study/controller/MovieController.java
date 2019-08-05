package com.itmuch.cloud.study.controller;


import com.itmuch.cloud.study.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
    	return this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
        // ......电影相关业务逻逻辑
    }
    
    public User findByIdFallback(Long id) {
		return new User(Long.valueOf(0L), "accountDefault", "默认用户", Integer.valueOf(0), BigDecimal.valueOf(0));
	}
}
