package com.example.helloboot2;

/**
 * Hello.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.30
 */
public class Hello {

    private String name;
    private int count;

    public Hello(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
