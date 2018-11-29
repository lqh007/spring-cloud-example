package com.liang.eurekao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaoApplication.class, args);
    }
}
