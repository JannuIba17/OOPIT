package com.Day7.Java8Features;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f= s->s.length();
        System.out.println(f.apply("Hello World!"));
    }

}
