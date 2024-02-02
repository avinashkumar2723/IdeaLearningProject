package com.avi.hakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfListElements {
    public static void main(String[] args) {
        //List<Long> list = Arrays.asList(1000020,2929292929,22233333,2222222);

        List<Long> list = Arrays.asList(1000020L,292929L,22233333L,2222222L);

        Long sum = 0L;

        for(Long l : list){
            sum+=l;
        }
    }
}
