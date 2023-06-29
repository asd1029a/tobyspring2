package com.example.helloboot2;

import com.example.config.MySpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MySpringBootApplication
public class Helloboot2Application {

    @Bean
    ApplicationRunner applicationRunner(Environment env) {
        return args -> {
            String name = env.getProperty("my.name");
            System.out.println("my name = "+ name);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Helloboot2Application.class, args);
    }
}
