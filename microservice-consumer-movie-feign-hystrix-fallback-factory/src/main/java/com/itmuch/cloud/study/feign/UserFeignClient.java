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

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.itmuch.cloud.study.entity.User;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

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
@FeignClient(name = "microservice-provider-user", fallbackFactory = UserFeignClientFallbackFactory.class) // 第一种方式，推荐，
//@FeignClient(name = "abcde", url = "http://localhost:8000/")// 第二种方式，可以选择，但是name属性必需写，不能省略
public interface UserFeignClient {

	@GetMapping(value = "/users/{id}")
	User findById(@PathVariable(name = "id", required = true) Long id);
}

@Component
@Slf4j
class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
	
	@Override
	public UserFeignClient create(Throwable cause) {
		return new UserFeignClient() {
			@Override
			public User findById(Long id) {
				log.error("进入回退逻辑", cause);
				return new User(0L, "accountDefault", "默认用户", Integer.valueOf(0), BigDecimal.valueOf(0));
			}
			
		};
	}
	
}
