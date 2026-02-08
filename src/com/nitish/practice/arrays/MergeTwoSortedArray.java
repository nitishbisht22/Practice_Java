package com.nitish.practice.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6 , 8 , 9};
        int[] arr2 = {1, 3 , 5};
        int[] ans = mergeTwoSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] finalArr = new int[size1 + size2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < size1 && j < size2){
            if (arr1[i] < arr2[j]){
                finalArr[k] =  arr1[i];
                k++;
                i++;
            }
            else {
                finalArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(j < size2){
            finalArr[k] = arr2[j];
            k++;
            j++;
        }
        while(i < size1){
            finalArr[k] = arr1[i];
            k++;
            i++;
        }

        return finalArr;
    }
}
