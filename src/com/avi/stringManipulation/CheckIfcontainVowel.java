package com.avi.stringManipulation;

public class CheckIfcontainVowel {
    public static void main(String[] args) {
        String input = "m a";

      //
        // if((input.toLowerCase().contains("a") || input.toLowerCase().contains("e") || input.toLowerCase().contains("i") || input.toLowerCase().contains("o") || input.toLowerCase().contains("u"))){
      if(  input.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("VOWEL");
        }else {
            System.out.println("no vowel");
        }

    }
}
