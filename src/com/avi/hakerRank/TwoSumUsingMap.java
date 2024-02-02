package com.avi.hakerRank;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TwoSumUsingMap {
    public static void main(String[] args) {
        int input[] = new int[]{2,4,3,7};
        int out[] = new int[2];
        int target = 5;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<input.length;i++) {
            int complement = target - input[i];
            if(map.containsKey(complement)){
                out[0] = map.get(complement);
                out[1] = i;
            }
            map.put(input[i],i);
        }

        System.out.println(out[0] +" : " +out[1]);


    }
}
