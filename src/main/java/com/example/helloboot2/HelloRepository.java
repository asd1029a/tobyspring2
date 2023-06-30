package com.example.helloboot2;

/**
 * HelloRepository.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.30
 */
public interface HelloRepository {

    Hello findHello(String name);
    void increaseCount(String name);

    default int countOf(String name) {
        Hello hello = findHello(name);
        return hello == null ? 0 : hello.getCount();
    }
}
