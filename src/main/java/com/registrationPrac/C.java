package com.registrationPrac;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
        //  Filter

        List<Integer> data = Arrays.asList(100, 20, 30, 35, 27, 500, 700);
        List<Integer> newData = data.stream().filter(x -> x > 100).collect(Collectors.toList());
        System.out.println(newData);
    }
}
// output:-[500,700]