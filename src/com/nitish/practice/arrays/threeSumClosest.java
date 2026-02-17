package com.nitish.practice.arrays;

import java.util.Arrays;

public class threeSumClosest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int ans = threeSumClosest(arr, 1);
        System.out.println(ans);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for(int i = 0; i < nums.length-2; i++){
            int n1 = nums[i];
            int potAns = twoSum(nums, i + 1, n - 1, n1 , target);
            if(Math.abs(target - potAns) < Math.abs(target - closest)){
                closest = potAns;
            }
        }
        return closest;
    }
    public static int twoSum(int[] nums , int start , int end , int n1, int target){
        int min = Integer.MAX_VALUE;
        int ans = 0;
        while(start < end){
            int sum = n1 + nums[start] + nums[end];
            if(sum < target){
                int difference = Math.abs(sum - target);
                if(difference < min){
                    min = difference;
                    ans = sum;
                }
                start++;
            }
            else if(sum > target){
                int difference = Math.abs(sum - target);
                if(difference < min){
                    min = difference;
                    ans = sum;
                }
                end--;
            }
            else{
                ans = sum;
                break;
            }
        }
        return ans;

    }
}