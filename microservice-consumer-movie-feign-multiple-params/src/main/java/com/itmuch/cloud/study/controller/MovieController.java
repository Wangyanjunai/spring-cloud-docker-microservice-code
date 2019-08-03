package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.feign.UserFeignClient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
    
// 写法并不正确，控制台会输出类似如下的异常，feign.FeignException: status 405 reading UserFeignClient#get0(User)   
//    @GetMapping("/users/get0")
//    public User get0(User user) {
//		return this.userFeignClient.get0(user);
//	}
    
    @GetMapping("/users/get1")
    public User get1(User user) {
		return this.userFeignClient.get1(user);
	}
    
    @GetMapping("/users/get2")
    public User get2(User user) {
		return this.userFeignClient.get2(user.getId(), user.getUsername());
	}
    
    @GetMapping("/users/get3")
    public User get3(User user) {
    	Map<String, Object> map = new HashMap<>();
    	map.put("id", user.getId());
    	map.put("username", user.getUsername());
		return this.userFeignClient.get3(map);
	}
    
    @PostMapping("/users/post")
    public User post(@RequestBody User user) {
		return this.userFeignClient.post(user);
	}
}
