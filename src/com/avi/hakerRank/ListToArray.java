package com.avi.hakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        var input = new int[]{2,5,3,6,8};
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(8);

        var count = new int[input.length];


        for (var digit : input)
            count[digit]++;



        var output = new int[input.length];

        System.out.println(Arrays.toString(input));


        output = list.stream().mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(output));

       // for (var i:output)
          //  System.out.print(i +" ");

    }
}
