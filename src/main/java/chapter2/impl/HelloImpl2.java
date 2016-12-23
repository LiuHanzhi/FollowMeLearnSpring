package chapter2.impl;

import chapter2.HelloApi;

/**
 * Created by liuhanzhi on 16/12/23.
 */
public class HelloImpl2 implements HelloApi {

    private String message;

    public HelloImpl2() {
        this.message = "Hello World!";
    }

    public HelloImpl2(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }

}
