package com.avi.mathsProblems;

public class NumberSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
    //using temp veriable
       /* temp = a;
        a = b;
        b = temp;*/

      //without using third variables
      a = a+b;
      b = a-b;
      a = a-b;

        System.out.println("a : " +a +" b : " +b);
    }
}
