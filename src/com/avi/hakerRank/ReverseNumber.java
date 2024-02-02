package com.avi.hakerRank;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 23498;
        StringBuilder reverse = new StringBuilder();

        while (number != 0){

            reverse.append(number%10);
            number = number/10;

        }
        System.out.println( reverse);
    }
}
