package com.eureka.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

/**
 * eureka 服务器
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String profile = scanner.nextLine();
        new SpringApplicationBuilder(EurekaServerApplication.class)
                .profiles(profile).run(args);
    }

}
