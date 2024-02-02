package com.avi.mathsProblems;

public class PrimeCheck {
    public static void main(String[] args) {
        int noToCheck = 7;
       // System.out.println(3%2);
        PrimeCheck pc = new PrimeCheck();


            System.out.println(pc.checkIfPrime(3));

            //print 20 prime number
        for (int i=1;i<=20;i++){
            if(pc.checkIfPrime(i))
                System.out.print(i +" ");
        }

    }

    boolean checkIfPrime(int n){

        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
