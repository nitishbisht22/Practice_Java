package com.nitish.practice.math;

import com.nitish.practice.utils.NewUtility;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("hello , today we will find max and min");
        int[] arr = NewUtility.inputArray();
        int max = maximum(arr);
        int min = minimum(arr);
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);

    }

    public static int maximum(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int i = 0;
        int max = arr[0];

        while (i < arr.length) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            i++;
        }
        return max;

    }

    public static int minimum(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int j = 0;
        int min = arr[0];
        while (j < arr.length) {
            if (arr[j] <= min) {
                min = arr[j];
            }
            j++;
        }
        return min;
    }
}
