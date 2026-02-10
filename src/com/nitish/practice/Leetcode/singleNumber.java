package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {1};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while( j < nums.length){
            if(nums[i] != nums[j]){
                return nums[i];
            }
            i = i + 2;
            j = j + 2;
        }
        return nums[i];
    }
}
