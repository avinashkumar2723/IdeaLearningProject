package com.avi.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("HI");

        List<String> list = Arrays.asList("Avinash","Ravi");

        list.stream().filter(s -> !s.contains("R")).forEach(s -> System.out.println(s));
    }
}





