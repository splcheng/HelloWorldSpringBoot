package com.joapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
@RequestMapping("/hello")
public class Application {

    public static void main(String[] args) {
        System.out.println("========================================== Start the application now......");
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}", produces = "application/json")
    public String get(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
