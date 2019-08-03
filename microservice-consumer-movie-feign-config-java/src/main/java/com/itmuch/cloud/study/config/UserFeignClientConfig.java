/**
 * <pre>
 * Project Name: microservice-consumer-movie-feign-config-java
 * File Name: UserFeignClientConfig.java
 * Package Name: com.itmuch.cloud.study.config
 * Create Date: 2019年8月3日 下午5:32:03
 * Copyright (c) 2018, 版权所有 (C) 2016-2036 土豆互联科技(深圳)有限公司 www.potato369.com All Rights Reserved。
 * </pre>
 */

package com.itmuch.cloud.study.config;

import org.springframework.context.annotation.Bean;

import feign.Logger;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.study.config
 * @ClassName UserFeignClientConfig
 * @Desc 
 * 该Feign Client的配置类，注意：
 * 1. 该类可以独立出去；
 * 2. 该类上也可添加@Configuration声明是一个配置类；
 * 配置类上也可添加@Configuration注解，声明这是一个配置类；
 * 但此时千万别将该放置在主应用程序上下文@ComponentScan所扫描的包中，
 * 否则，该配置将会被所有Feign Client共享，无法实现细粒度配置！
 * 个人建议：像我一样，不加@Configuration注解
 * @WebSite https://www.potato369.com
 * @Author Administrator
 * @Date 2019年8月3日 下午5:32:03
 * @CreateBy Eclipse IDEA Neon.3 Release(4.6.3)
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技（深圳）有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */

public class UserFeignClientConfig {

	@Bean
	public Logger.Level feignLogger() {
		return Logger.Level.FULL;
	}
}

