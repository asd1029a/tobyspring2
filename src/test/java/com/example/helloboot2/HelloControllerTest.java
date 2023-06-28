package com.example.helloboot2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * HelloControllerTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.28
 */
public class HelloControllerTest {

    @Test
    void helloController() {

        HelloController helloController = new HelloController(name -> name);

        String ret = helloController.hello("Test");
        Assertions.assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failsHelloController() {
        HelloController helloController = new HelloController(name -> name);


        Assertions.assertThatThrownBy(() -> {
            helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() -> {
            helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
