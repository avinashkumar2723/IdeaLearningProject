package com.avi.mathsProblems;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a =0;
        int b =1;
        int c =a+b;
        for (int i=0 ; i<10 ; i++){
            a=b;
            b=c;
            c=a+b;

            System.out.print(a +" ");
            System.out.println("a");
        }
    }
}
