package com.example.helloboot2;

import org.springframework.stereotype.Component;

/**
 * SimpleHelloService.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.27
 */
@MyComponent
public class SimpleHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }
}
