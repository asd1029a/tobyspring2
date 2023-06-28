package com.example.helloboot2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * HelloServiceTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.28
 */
public class HelloServiceTest {

    @Test
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

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
