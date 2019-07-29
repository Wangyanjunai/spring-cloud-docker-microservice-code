package com.itmuch.cloud.study.user.controller;

import com.itmuch.cloud.study.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.study.user.controller
 * @ClassName MovieController
 * @Desc
 * @WebSite https://www.potato369.com
 * @Author Jack
 * @Date 2019/7/29 11:58
 * @CreateBy IntellJ IDEA 2019.1.1
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技(深圳)有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
        User user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
        // ......电影相关业务逻逻辑
        return user;
    }
}
