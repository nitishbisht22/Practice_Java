package com.nitish.practice.arrays;

import com.nitish.practice.utils.NewUtility;

public class ArrraySorted {
    public static void main(String[] args) {
        int[] arr = NewUtility.inputArray();
        boolean isSorted = sorted(arr);
        if (isSorted) {
            System.out.println("Sorted array");
        } else {
            System.out.println("Unsorted array");
        }

    }

    public static boolean sorted(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
