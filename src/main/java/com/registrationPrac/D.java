package com.registrationPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("hena", "hen", "hate", "juhi", "hu");
        List<String> newData = data.stream().filter(x -> x.startsWith("h")).collect(Collectors.toList());
        System.out.println(newData);
    }
}
// output:-[hena, hen, hate, hu]