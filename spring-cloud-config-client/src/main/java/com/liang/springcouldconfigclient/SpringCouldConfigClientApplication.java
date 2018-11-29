package com.liang.springcouldconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCouldConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCouldConfigClientApplication.class, args);
    }
}
