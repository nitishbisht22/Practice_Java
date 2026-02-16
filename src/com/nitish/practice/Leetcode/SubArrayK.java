package com.nitish.practice.Leetcode;

public class SubArrayK {
    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int ans = numOfSubarrays(arr , 3 , 5);
        System.out.println(ans);
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int average = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int target = k * threshold;
        while(j < arr.length){
            sum = sum + arr[j];
            if(j - i + 1 == k)
            { if(sum >= target){
                count++;
            }
            sum = sum - arr[i];
                i++;
            }
            j++;
        }
        return count;
    }
}
