package com.registrationPrac;

import java.util.function.Predicate;

public class B {

    public static void main(String[] args) {
        // Predicate Function Interface
        //It takes input & produces boolean value output

        Predicate<String> val =  x->x.equals("mike");
        boolean result = val.test("mike");
        System.out.println(result);
    }
}
// output:-true

