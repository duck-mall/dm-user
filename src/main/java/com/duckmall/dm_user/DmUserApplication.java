package com.duckmall.dm_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmUserApplication.class, args);
    }

}
