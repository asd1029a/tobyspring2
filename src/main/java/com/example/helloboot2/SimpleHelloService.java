package com.example.helloboot2;

/**
 * SimpleHelloService.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.27
 */
@MyComponent
public class SimpleHelloService implements HelloService {

    private final HelloRepository helloRepository;

    public SimpleHelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String sayHello(String name) {

        helloRepository.increaseCount(name);
        return String.format("Hello %s", name);
    }
}
