package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * MySpringBootAnnotation.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Configuration
@ComponentScan
@EnableMyAutoConfigration
public @interface MySpringBootApplication {
}
