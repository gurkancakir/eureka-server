package com.gurkan.panel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PanelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanelApplication.class, args);
    }
}
