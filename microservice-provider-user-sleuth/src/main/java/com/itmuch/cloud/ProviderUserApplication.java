package com.itmuch.cloud;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProviderUserApplication.class);
	
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
        LOGGER.info("The Microsoft Application for Providing User Information has been started...");
    }

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            User user1 = new User(1L, "account01", "张三", 20, new BigDecimal(100.00));
            User user2 = new User(2L, "account02", "李四", 28, new BigDecimal(180.00));
            User user3 = new User(3L, "account03", "王五", 32, new BigDecimal(280.00));
            User user4 = new User(4L, "account04", "赵六", 39, new BigDecimal(220.00));
            User user5 = new User(5L, "account05", "卢七", 39, new BigDecimal(520.00));
            Stream.of(user1, user2, user3, user4, user5).forEach(repository::save);
        };
    }
}
