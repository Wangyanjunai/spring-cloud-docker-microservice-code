/**
 * <pre>
 * Project Name: microservice-consumer-movie-feign
 * File Name: UserFeignClient.java
 * Package Name: com.itmuch.cloud.study.feign
 * Create Date: 2019年8月3日 下午4:55:09
 * Copyright (c) 2018, 版权所有 (C) 2016-2036 土豆互联科技(深圳)有限公司 www.potato369.com All Rights Reserved。
 * </pre>
 */
package com.itmuch.cloud.study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.itmuch.cloud.study.entity.User;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.study.feign
 * @ClassName UserFeignClient
 * @Desc 用Feign改写，让其达到与Ribbon + RestTemplate相同的效果。
 * @WebSite https://www.potato369.com
 * @Author Administrator
 * @Date 2019年8月3日 下午4:55:09
 * @CreateBy Eclipse IDEA Neon.3 Release(4.6.3)
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技（深圳）有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

	@GetMapping(value = "/users/{id}")
	User findById(@PathVariable(name = "id", required = true) Long id);
}

