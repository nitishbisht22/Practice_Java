package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rearrangeArray(int[] nums){
        int[] newArr = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        int i = 0;
        while (i < nums.length){
            if(nums[i] > 0){
                newArr[evenIndex] = nums[i];
                evenIndex = evenIndex + 2;
            }
            else{
                newArr[oddIndex] = nums[i];
                oddIndex =  oddIndex + 2;
            }
            i++;
        }
        return newArr;
    }
}