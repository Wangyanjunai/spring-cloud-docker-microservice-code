package com.itmuch.cloud.config;

//import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;

//import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.config
 * @ClassName RibbonConfiguration
 * @Desc 该类为Ribbon的配置类
 *       注意：该类不能放在主应用程序上下文@ComponentScan所扫描的包中，否则配置将会被所有Ribbon Client共享。
 * @WebSite https://www.potato369.com
 * @Author Jack
 * @Date 2019/8/2 18:15
 * @CreateBy IntellJ IDEA 2019.1.1
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技(深圳)有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        
//      return new RandomRule();// 负载均衡规则，改为随机
//    	return new AvailabilityFilteringRule();//过滤掉一直连接失败的被标记为circuit tripped的后端Server，并过滤掉那些高并发的后端Server或者使用一个AvailabilityPredicate来包含过滤server的逻辑，其实就就是检查status里记录的各个Server的运行状态；
//    	return new RoundRobinRule(); //轮询选择， 轮询index，选择index对应位置的Server；
    	return new ZoneAvoidanceRule();
    }
}
