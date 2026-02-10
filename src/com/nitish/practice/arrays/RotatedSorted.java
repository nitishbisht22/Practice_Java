package com.nitish.practice.arrays;

public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr = {1 , 1 , 1};
        boolean ans = check(arr);
        System.out.println(ans);
    }
    public static boolean check(int[] nums) {
        int index = 1;
        int pair = 0;
        int n = nums.length;
        if(nums[n - 1] > nums[0])
        {
            pair++;
        }
        while(index < nums.length){
            if(nums[index - 1] > nums[index]){
                pair++;
            }
            index++;
        }
        return pair <= 1;
    }
}
