package chapter2;

import chapter2.impl.HelloImpl2;

/**
 * Created by liuhanzhi on 16/12/23.
 */
public class HelloApiStaticFactory {

    public static HelloApi newInstance(String message){
        return new HelloImpl2(message);
    }
}
