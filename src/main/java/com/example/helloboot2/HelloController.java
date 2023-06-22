package com.example.helloboot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.22
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return String.format("hello %s",name);
    }
}
