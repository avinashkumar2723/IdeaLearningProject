package com.avi.stringManipulation;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcde";
        StringBuilder revString = new StringBuilder();

        for(int i=s.length()-1; i>=0;i--){
            revString.append(s.charAt(i));
        }

 ReverseString obj = new ReverseString();

        if (obj.checkIfPrime(19))
            System.out.println("Prime");

        System.out.println(revString);
    }


    public boolean checkIfPrime(int n) {
        if(n==0 ||n==1)
            return false;

        else if (n==2)
            return true;

        else {
            for (int i = 3; i< n/2;n++){
                if (n%i==0)
                    return true;
            }

        }

        return true;
    }
}
