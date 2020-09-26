package com.example.msscspringconfigserver.msscspringconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsscSpringConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscSpringConfigServerApplication.class, args);
    }

}
