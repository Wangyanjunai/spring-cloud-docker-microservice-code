package com.itmuch.cloud.study.config;

import com.itmuch.cloud.config.DefaultRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.study.config
 * @ClassName TestConfiguration
 * @Desc
 * @WebSite https://www.potato369.com
 * @Author Jack
 * @Date 2019/8/2 18:13
 * @CreateBy IntellJ IDEA 2019.1.1
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技(深圳)有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */
@RibbonClients(defaultConfiguration = DefaultRibbonConfig.class)
public class RibbonClientDefaultConfigurationTestsConfig {
}
