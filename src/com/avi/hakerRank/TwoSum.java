package com.avi.hakerRank;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = new int[]{3,2,4};
        int target = 6;
        TwoSum two = new TwoSum();
        int out[] = two.twoSum(nums,target);
        for (int i : out){
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int out[] = new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<j){

            if(nums[i] + nums[j] > target){
                j--;
            }else if(nums[i] + nums[j] < target){
                i++;
            }else{
                out[0] = i;
                out[1] = j;
                i++;
                j++;
            }
        }
        return out;
    }
}
