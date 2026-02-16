package com.nitish.practice.Leetcode;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int ans = subArray(arr , 3);
        System.out.println(ans);
    }
    public static int subArray(int[] arr, int k)
    {
        int potentialAns = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < arr.length){
            sum = sum + arr[j];
            if (j - i + 1 == k){
                potentialAns = Math.min(potentialAns, sum); // find max
                sum = sum - arr[i]; // remove first element sum
                i++;
            }
            j++;
        }
        return potentialAns;
    }
}
