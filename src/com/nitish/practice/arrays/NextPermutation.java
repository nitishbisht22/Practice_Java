package com.nitish.practice.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        nextPermutation(arr);
    }
    public static void nextPermutation(int[] nums) {
        int i = nums.length-1;
        int n = nums.length-1;
        while(i >= 0) {
            if (i == 0){
                reverse(nums , i , n);
                break;
            }
            else if(nums[i - 1] < nums[i]) {
                int ans = greaterElement(nums , i-1,i , n); // this is the next greater
                swap(nums, i - 1, ans);
                reverse(nums, i, n);
                break;
            }
            i--;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int greaterElement(int[] nums, int pivot, int start, int end){
        for(int k = end; k >= start; k--){
            if(nums[k] > nums[pivot]){
                return k;   // rightmost greater
            }
        }
        return pivot; // theoretically never
    }


    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
