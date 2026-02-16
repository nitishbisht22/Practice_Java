package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class sortArrayOarity {
    public static void main(String[] args) {
        int[] arr = {0}; // 3 , 2, 4, 1
        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            if (nums[start] % 2 == 0 && nums[end] % 2 == 0){
                start++;
            }
            else if (nums[start] % 2 != 0 && nums[end] % 2 == 0){ // 1, 2, 4
                swap(nums , start , end);
                start++;
            }
            else if (nums[start] % 2 == 0 && nums[end] % 2 != 0){
                start++;
            }
            else {
                end--;
            }

        }
        return nums;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    }