package com.example.config;

import com.example.config.autoconfig.ServerProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * EnableMyConfigrationProperties.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyConfigurationPropertiesImportSelector.class)
public @interface EnableMyConfigrationProperties {
    Class<?> value();
}
