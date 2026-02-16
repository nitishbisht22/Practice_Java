package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class submAX {
    public static void main(String[] args) {
        int[] arr = {4, 2, 12, 3, 8, 7, 9, 5};
        int[] ans = subArray(arr , 3);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] subArray(int[] arr, int k) {
        int n = arr.length;
        int[] newArr = new int[n - k + 1];
        int index = 0;
        int i = 0;
        int j = 0;
        int max = arr[0];
        while(j < arr.length){
            // calculations
            max = Math.max(max, arr[j]); // 12
            if(j - i + 1 == k)
            {
                //calculations
                if(max == arr[i])
                {
                    newArr[index] = max; // newArr mai max chala ja rha hai.
                    max = Math.max(arr[i + 1], arr[j]);
                    index++;
                }
                else{
                    newArr[index] = max;
                    index++;
                }
                i++;
            }
            j++;
        }
        return newArr;
    }
}
