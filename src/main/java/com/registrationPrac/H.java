package com.registrationPrac;

import java.util.function.Function;

public class H {
    public static void main(String[] args) {
        Function<Integer,Integer> x = s ->s*s;
        Integer val = x.apply(100);
        System.out.println(val);
    }
}
