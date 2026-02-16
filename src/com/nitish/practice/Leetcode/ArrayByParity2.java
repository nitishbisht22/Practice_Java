package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class ArrayByParity2 {
    public static void main(String[] args) {
        int[] arr = {4 , 2 , 5 , 7};
        int[] ans = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while(i <  nums.length - 1){
            if(nums[i] % 2 == 0){
                i = i + 2;
            }
            else{
                if(nums[j] % 2 == 0){
                    swap(nums , i , j);
                    j = j + 2;
                }
                else{
                    j = j + 2;
                }
            }
        }
        return nums;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}