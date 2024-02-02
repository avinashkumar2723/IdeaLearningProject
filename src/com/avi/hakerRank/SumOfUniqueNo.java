package com.avi.hakerRank;

public class SumOfUniqueNo {

    public static void main(String[] args) {
        SumOfUniqueNo sum = new SumOfUniqueNo();
        int[] nums = new int[]{-92,22,2,11,39,36,51,71,42};
       // System.out.println(sum.sumOfUnique1(nums));

        System.out.println(sum.pow(-1,1,20));
    }





    int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        int mul =1;

        for(int i=1;i<=B;i++){
            mul *= A;
        }

        return Math.abs(mul)%C;
    }





    public int sumOfUnique1(int[] A) {

        int maxEven = -1000000;
        int minOdd = 999999;

        for(int i=0;i<A.length;i++){

            if(A[i]%2==0 && A[i] > maxEven){
                maxEven = A[i];
            }else if(A[i]!=0 && A[i] < minOdd){
                minOdd = A[i];
            }
        }

        return maxEven - minOdd;

    }



    public int sumOfUnique(int[] nums) {
        int sum = 0;


        for(int i=0;i<nums.length;i++){
            boolean flag = true;

            for(int j=i+1;j<nums.length;j++){

                if(nums[i] == nums[j]){
                    flag = false;
                    break;
                }

            }

            if(flag){
                sum = sum + nums[i];
            }else{
                continue;
            }

        }

        return sum;
    }
}
