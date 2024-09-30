package com.registrationPrac;

import java.util.function.Consumer;
import java.util.function.Function;

public class G {
    public static void main(String[] args) {
        Function<String,Integer> x = s -> s.length();
        Integer val = x.apply("mike");
        System.out.println(val);
    }
}
// output:- 4