package com.registrationPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class I {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 35, 12, 14);
        List<Integer> newData = data.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(newData);
    }
}
//output:-[100, 400, 1225, 144, 196]