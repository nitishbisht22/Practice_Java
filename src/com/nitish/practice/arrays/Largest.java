package com.nitish.practice.arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {3, 3, 0, 99, -40};
        int ans = largestElement(arr);
        System.out.println(ans);

    }
    public static int largestElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        while(index < nums.length){
            if(nums[index] > max){
                max = nums[index];
            }
            index++;
        }
        return max;
    }
}
