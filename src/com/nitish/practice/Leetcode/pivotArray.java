package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class pivotArray {
    public static void main(String[] args) {
        int[] arr = {-3,4,3,2};
        int[] ans = pivotArray(arr , 2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int i = 0;
        int lessthanPivot = 0;
        int equaltoPivot = 0;
        while(i < nums.length){
            if(nums[i] == pivot){
                equaltoPivot++;
            }
            else if(nums[i] < pivot){
                lessthanPivot++;
            }
            i++;
        }

        int less = lessthanPivot;
        int more = lessthanPivot + equaltoPivot;

        int[] newArr = new int[nums.length];
        int k = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] < pivot){
                newArr[k] =  nums[j];
                k++;
            }
            else if(nums[j] == pivot){
                newArr[less] = nums[j];
                less++;
            }
            else{
                newArr[more] = nums[j];
                more++;
            }
        }
        return newArr;
    }
}
