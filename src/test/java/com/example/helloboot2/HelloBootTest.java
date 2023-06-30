package com.example.helloboot2;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * HelloBootTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.30
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Helloboot2Application.class)
@TestPropertySource("classpath:/application.properties")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Transactional
public @interface HelloBootTest {
}
