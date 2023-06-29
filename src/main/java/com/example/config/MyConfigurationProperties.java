package com.example.config;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * MyConfigurationProperties.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface MyConfigurationProperties {
    String prefix();
}
