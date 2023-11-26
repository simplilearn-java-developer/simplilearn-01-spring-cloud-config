package com.simplilearn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Simplilearn01SpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Simplilearn01SpringConfigApplication.class, args);
    }

}
