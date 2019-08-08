package com.itmuch.cloud.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import rx.Observable;

@Service
public class AggregationService {

	@Autowired
	public RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback")
	public Observable<User> getUserById(Long id) {
		// 创建一个被观察者
		return Observable.unsafeCreate(observer -> {
			// 请求用户微服务的/users/{id}端点
			User user = this.restTemplate.getForObject("http://microservice-provider-user/users/{id}", User.class, id);
			observer.onNext(user);
			observer.onCompleted();
		});
	}

	@HystrixCommand(fallbackMethod = "fallback")
	public Observable<User> getMovieUserByUserId(Long id) {
		return Observable.unsafeCreate(observer -> {
			// 请求电影微服务的/movies/users/{id}端点
			User movieUser = this.restTemplate.getForObject("http://microservice-consumer-movie/movies/users/{id}", User.class, id);
			observer.onNext(movieUser);
			observer.onCompleted();
		});
	}

	public User fallback(Long id) {
		User user = new User();
		user.setId(-1L);
		return user;
	}
}
