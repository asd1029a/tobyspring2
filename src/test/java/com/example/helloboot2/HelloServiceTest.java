package com.example.helloboot2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * HelloServiceTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.28
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastTest {

}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Test
@interface UnitTest {

}

public class HelloServiceTest {

    @UnitTest
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService(helloRepository);

        String ret = helloService.sayHello("Test");

        Assertions.assertThat(ret).isEqualTo("Hello Test");
    }

    @Test
    void helloDecorator() {
        HelloDecorator deco = new HelloDecorator(name -> name);
        String test = deco.sayHello("Test");
        Assertions.assertThat(test).isEqualTo("*Test*");
    }
}
