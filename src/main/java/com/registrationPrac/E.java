package com.registrationPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(10, 11, 13, 15, 14, 16, 19);
        List<Integer> newDate = data.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
        System.out.println(newDate);
    }
}
// output:-[10, 14, 16]