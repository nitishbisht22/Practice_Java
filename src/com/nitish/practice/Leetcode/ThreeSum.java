package com.nitish.practice.Leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-4 , -1 , -1 , 0 , 0 , 1 , 2 , 2};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        // fixing one element n1
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int n1 = nums[i];
            int target = -n1;

            twoSum(nums , target , i + 1 , n - 1, n1 , res ); // it will find n2 and n3 for me.

        }
        return res;

    }

    private static void twoSum(int[] nums, int target, int firstPointer, int lastPointer, int n1,List<List<Integer>> res) {
        while(firstPointer < lastPointer){
            int sum = nums[firstPointer] + nums[lastPointer];
            if(sum > target){
                lastPointer--;
            }
            else if(sum < target){
                firstPointer++;
            }
            else{
                res.add(Arrays.asList(n1, nums[firstPointer], nums[lastPointer]));
                while(firstPointer < lastPointer && nums[firstPointer] == nums[firstPointer+1]) firstPointer++;
                while(firstPointer < lastPointer && nums[lastPointer] == nums[lastPointer-1]) lastPointer--;
                firstPointer++;
                lastPointer--;
            }

            }

        }
    }

