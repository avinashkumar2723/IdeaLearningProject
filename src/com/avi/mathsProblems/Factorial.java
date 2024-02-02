package com.avi.mathsProblems;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int factorial =1;

        for(int i=1;i<=4; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}
