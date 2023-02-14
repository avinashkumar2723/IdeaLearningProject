package com.avi.mathsProblems;

public class PrimeCheck {
    public static void main(String[] args) {
        int noToCheck = 7;
        System.out.println(3%2);
        PrimeCheck pc = new PrimeCheck();

        try {
            System.out.println(pc.checkIfPrime(3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    boolean checkIfPrime(int noToCheck){


        try {
            for(int i =2;i<(noToCheck);i++){
                if((noToCheck%i) == 0) {
                    return false;
                }
                else {
                    return true;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
}
