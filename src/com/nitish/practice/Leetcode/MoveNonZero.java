package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class MoveNonZero {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,0,6,0};
        moveZeroes(arr);

    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != 0){
                if(i != j){
                    swap(nums, i, j);
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
