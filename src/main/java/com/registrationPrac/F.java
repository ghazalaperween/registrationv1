package com.registrationPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 11, 13, 52, 15, 36, 19);
        List<Integer> newData = data.stream().filter(t -> t % 2 != 0).collect(Collectors.toList());
        System.out.println(newData);
    }
}
// output:-[11, 13, 15, 19]