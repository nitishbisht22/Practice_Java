package com.nitish.practice.Leetcode;

import com.nitish.practice.arrays.ArrraySorted;

import java.util.Arrays;

public class RemoveDuplicated {
    public static void main(String[] args) {
        int[] arr = {1 , 1, 2};
        int ans = removeDuplicates(arr);
        System.out.println(ans);


    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                swap(nums , i + 1 , j);
                i++;
            }
            j++;
        }

        return i + 1;
    }

    public static void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
