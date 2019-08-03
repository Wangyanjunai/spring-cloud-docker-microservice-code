package com.itmuch.cloud.study.controller;


import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.feign.UserFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
    	return this.userFeignClient.findById(id);
        // ......电影相关业务逻逻辑
    }
}
