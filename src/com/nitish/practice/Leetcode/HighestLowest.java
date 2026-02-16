package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class HighestLowest {
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 15, 20, 5};
        int ans = highest(arr , 6);
        System.out.println(ans);
    }
    public static int highest(int[] arr, int k){
        /*
        //1 , 4, 7 , 9
        if(arr.length <= 1 || k <= 1){
            return 0;
        }
        Arrays.sort(arr);
        int n = arr.length;
        int potentialAns = Integer.MAX_VALUE;
        int difference = 0;
        for(int i = 0; i < n - k + 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(j - i + 1 == k)
                {
                    //calculation
                    difference = arr[j] - arr[i];
                    potentialAns = Math.min(potentialAns, difference);
                }
            }
        }
        return potentialAns;
    }
         */
        int potentialAns = Integer.MAX_VALUE;
        int difference = 0;
        if(arr.length <= 1 || k <= 1){
            return 0;
        }
        Arrays.sort(arr);
        int i = 0;
        int j = i + 1;
        while(j < arr.length){
            if(j - i + 1 == k)
            {
                difference = arr[j] - arr[i];
                potentialAns = Math.min(difference,potentialAns);
                i++;
            }
            j++;
        }
        return potentialAns;
    }
}
