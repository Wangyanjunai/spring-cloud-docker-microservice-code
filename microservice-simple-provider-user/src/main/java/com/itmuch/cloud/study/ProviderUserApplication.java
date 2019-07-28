package com.itmuch.cloud.study;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            User user1 = new User(1L, "account01", "张三", 20, new BigDecimal(100.00));
            User user2 = new User(2L, "account02", "李四", 28, new BigDecimal(180.00));
            User user3 = new User(3L, "account03", "王五", 32, new BigDecimal(280.00));
            User user4 = new User(4L, "account04", "赵六", 39, new BigDecimal(220.00));
            Stream.of(user1, user2, user3, user4).forEach(repository::save);
        };
    }
}
