package com.avi.mathsProblems;

import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 9, 6, 1};
        List<Integer> list = Arrays.asList(3, 2, 5, 9, 6, 1);

        Collections.sort(list);


        Arrays.sort(array);

        for (int a : array)
            System.out.print(a + " ");

        for (Integer a : list)
            System.out.print(a + " ");
    }
}
