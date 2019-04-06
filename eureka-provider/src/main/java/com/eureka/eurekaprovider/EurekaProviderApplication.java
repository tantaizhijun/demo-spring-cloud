package com.eureka.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

@SpringBootApplication
public class EurekaProviderApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();

        //启动时手动输入启动端口
        new SpringApplicationBuilder(EurekaProviderApplication.class)
                .properties("server.port=" + port)
                .run(args);
    }

}
