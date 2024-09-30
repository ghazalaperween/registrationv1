package com.registrationPrac; // StreamAPI

import java.util.function.Predicate;

public class A {
    public static void main(String[] args) {
        // Predicate Functional InterFace
        // It takes input & produce boolean value output

        Predicate<Integer> val = x->x>300;
        boolean result = val.test(100);
        System.out.println(result);
    }
}
// output:- true