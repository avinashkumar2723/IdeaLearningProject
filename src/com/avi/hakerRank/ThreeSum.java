package com.avi.hakerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
       int nums []= new int[]{-1,0,1,2,-1,-4};
       ThreeSum sum  = new ThreeSum();
       List<List<Integer>> lists = new ArrayList<>();
       lists=sum.threeSum(nums);
        for(List<Integer> list : lists)
            System.out.println(list);
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList();
        List<Integer> list ;

        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                for(int k=j+1;k<=nums.length-1;k++){
                    int sum = nums[i] +nums[j]+nums[k];
                    if(i !=j && i!=k && j!=k && sum==0){
                        list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!lists.contains(list)){
                            lists.add(list);
                        }

                    }
                }
            }
        }
        return lists;
    }

}
