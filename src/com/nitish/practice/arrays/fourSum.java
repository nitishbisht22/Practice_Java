package com.nitish.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class fourSum {
    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> ans = fourSum(arr, -294967296);
        System.out.println(ans);

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            long firstPointer = nums[i];
            for (int j = i + 1; j < n - 2; j++) {
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                long secondPointer = nums[j];
                threeSum(nums, firstPointer, secondPointer, j + 1, n - 1, target, res);
            }
        }
        return res;
    }

    public static void threeSum(int[] nums, long firstPointer, long secondPointer, int start, int end, int target, List<List<Integer>> res) {
        while (start < end) {
            long sum = firstPointer + secondPointer + (long)nums[start] + nums[end];
            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                res.add(Arrays.asList((int)firstPointer,(int) secondPointer, nums[start], nums[end]));
                while (start < end && nums[start] == nums[start + 1]) {
                    start++;
                }
                while (start < end && nums[end] == nums[end - 1]) {
                    end--;
                }
                start++;
                end--;
            }
        }
    }
}
