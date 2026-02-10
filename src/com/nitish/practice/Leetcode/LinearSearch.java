package com.nitish.practice.Leetcode;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, -4, 4, 0, 10};
        int ans = linearSearch(arr, 6);
        System.out.println(ans);

    }
    public static int linearSearch(int nums[], int target){
        int index = 0;
        while(index < nums.length){
            if(nums[index] == target){
                return index;
            }
            index++;
        }
        return -1;

    }
}
