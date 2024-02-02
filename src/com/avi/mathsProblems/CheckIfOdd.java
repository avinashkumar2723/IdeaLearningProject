package com.avi.mathsProblems;

import java.util.Arrays;
import java.util.List;

public class CheckIfOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,7,9);
        CheckIfOdd oddList = new CheckIfOdd();
        if (oddList.checkIfAllOdd(list))
            System.out.println("All Odd");
        else
            System.out.println("All not Odd");


    }

    public boolean checkIfAllOdd(List<Integer> list){

        for (Integer i: list){
            if (i%2 == 0)
                return false;
        }
        return true;
    }
}
