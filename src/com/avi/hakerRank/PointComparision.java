package com.avi.hakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointComparision {
    public static void main(String[] args) {
        //int[] a = {1, 2, 3};
       // int[] b = {3, 2, 1};
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(3,2,1);


    PointComparision pointComparision = new PointComparision();

        System.out.println(pointComparision.comaprePointList(a,b).toString());

        /*for (int a1 : output){
            System.out.println(a1);
        }*/

    }

    public int[] comaprePoint(int[] a,int b[]){

        int[] comparision = new int[2];
        int aPoint=0;
        int bPoint=0;
        for (int i=0;i<3;i++){
            if(a[i] > b[i])
                aPoint++;
            else if(a[i] < b[i])
                bPoint++;
        }
        comparision[0] =aPoint;
        comparision[1] =bPoint;
        return comparision;
    }

    public List<Integer> comaprePointList(List<Integer> a, List<Integer> b){

        List<Integer> comparision = new ArrayList<>();
        int aPoint=0;
        int bPoint=0;
        for (int i=0;i<3;i++){
            if(a.get(i) > b.get(i))
                aPoint++;
            else if(a.get(i) < b.get(i))
                bPoint++;
        }
        comparision.add(aPoint);
        comparision.add(bPoint);
        return comparision;
    }


}
