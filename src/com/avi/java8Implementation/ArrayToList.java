package com.avi.java8Implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToList {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1,2,3};

        List<Integer> list = IntStream.of(arrayInt).boxed().collect(Collectors.toList());


    }
}
