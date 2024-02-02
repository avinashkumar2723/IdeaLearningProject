package com.avi.stringManipulation;

public class CheckPallindrom {
    public static void main(String[] args) {
        CheckPallindrom checkPallindrom = new CheckPallindrom();
        if (checkPallindrom.checkIfPallindrom("abc"))
            System.out.println("Pallindrome");
        else System.out.println("Not a Pallindrome");
    }


    public boolean checkIfPallindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;
    }
}
