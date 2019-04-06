package com.eureka.eurekaconsumer.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class TestController {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplete() {
        return new RestTemplate();
    }

    /**
     * router方法用来对外发布服务，只起路由作用，实际上是RestTemplate调用的服务提供方
     * @return
     */
    @RequestMapping(value="/router",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String router() {
        RestTemplate templete = getRestTemplete();
        String object = templete.getForObject("http://eureka-provider/person/1", String.class);
        return object;
    }
}
