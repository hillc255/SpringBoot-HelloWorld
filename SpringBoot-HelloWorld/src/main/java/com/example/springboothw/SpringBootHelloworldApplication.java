package com.example.springboothw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@ServletComponentScan
public class SpringBootHelloworldApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootHelloworldApplication.class, args);
    }

}
