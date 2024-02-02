package com.avi.hakerRank;

public class signedArrayPair {

    public static void main(String[] args) {
        signedArrayPair s = new signedArrayPair();
        int nums[] = {3,1,-2,-5,2,-4};
        int out[] = new int[6];
        out=s.rearrangeArray(nums);
        System.out.println();
        for(int i: out){
            System.out.print(i+" , ");
        }
    }



    public int[] rearrangeArray(int[] nums) {
        int length= nums.length;
        int even[] = new int[nums.length/2];
        int odd[] = new int[nums.length/2];
        int o=0;
        int e=0;
        int n=0;
        int out[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0) {
                odd[o] = nums[i];
                o++;
            }

            else {
                even[e] = nums[i];
                e++;
            }
        }

        System.out.println("odd : ");
        for(int i:odd){
            System.out.print(i+" , ");
        }

        System.out.println();
        System.out.println("Even : ");
        for(int i:even){
            System.out.print(i +" , ");
        }

        for(int i=0;i<length/2;i++){
            out[++n] = even[i];
            out[++n]=odd[i];
        }

        return out;
    }
}
