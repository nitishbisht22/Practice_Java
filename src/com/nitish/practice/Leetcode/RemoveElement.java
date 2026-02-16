package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int ans = removeElement(arr, 2);
        System.out.println(ans);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

