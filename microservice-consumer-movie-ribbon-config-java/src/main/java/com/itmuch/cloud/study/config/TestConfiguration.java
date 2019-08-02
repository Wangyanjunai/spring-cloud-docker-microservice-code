package com.itmuch.cloud.study.config;

import com.itmuch.cloud.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.study.config
 * @ClassName TestConfiguration
 * @Desc
 * 使用RibbonClient，为特定的目标服务自定义配置。
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 * 可参考的示例：
 * http://spring.io/guides/gs/client-side-load-balancing/
 * @WebSite https://www.potato369.com
 * @Author Jack
 * @Date 2019/8/2 18:13
 * @CreateBy IntellJ IDEA 2019.1.1
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技(深圳)有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */
@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
