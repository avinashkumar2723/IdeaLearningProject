package com.avi.hakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

   /* Given a square matrix,
   calculate the absolute difference between the sums of its diagonals.
    */

    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
        int left = (list.get(0).get(2)+list.get(1).get(1)+list.get(2).get(0));
        int right = (list.get(0).get(0)+list.get(1).get(1)+list.get(2).get(2));

        int difference =  left-right;
        for (List l: list){
            System.out.println(l.toString());
        }

        System.out.println("Difference: " + difference);

    }

    public int getDifference(List<List<Integer>> list,int n){
        int left =0;
        int right =0;

        for(int i=0;i<n;i++){
            left+=list.get(0).get(0);
        }


       return  (list.get(0).get(0)+list.get(1).get(1)+list.get(2).get(2)) - (list.get(0).get(2)+list.get(1).get(1)+list.get(2).get(0));
    }
}
