package com.avi.hakerRank;

import java.util.Arrays;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        String output = new String();
        for(int i=0;i<indices.length;i++){

            output+= s.charAt(indices[i]);
        }

        return output;
    }

    public static void main(String[] args) {
        ShuffleString shuffleString = new ShuffleString();
        int[] indices = new int[]{4,5,6,7,0,2,1,3};

        System.out.println(shuffleString.restoreString("codeleet",indices));

    }

}
