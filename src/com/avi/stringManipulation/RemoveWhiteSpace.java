package com.avi.stringManipulation;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s = " av  inash ";
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<s.length();i++){
            if(!Character.isWhitespace(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);

        String s1 = s.strip();
        System.out.println(s1);

    }
}
