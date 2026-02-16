package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class ApplyOperations {
    public static void main(String[] args) {
        int[] arr= {1,2,2,1,1,0};
        int[] ans = applyOperations(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] applyOperations(int[] nums) {
        int i = 0;
        while(i < nums.length - 1)
        {
            if(nums[i] != nums[i+1])
            {
                i++;
            }
            else {
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
                i++;
            }
        }
        int k = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] > 0)
            {
                nums[k] = nums[j];
                k++;
            }
        }
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
        return nums;
    }

}
