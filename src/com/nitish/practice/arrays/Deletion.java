package com.nitish.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;
import com.nitish.practice.utils.NewUtility;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = NewUtility.inputArray();
        System.out.print("enter the number you want to delete: ");
        Scanner sc = new Scanner(System.in);
        int numberToDelete = sc.nextInt();
        int[] ans = delete(arr, numberToDelete);
        System.out.println("the new array is " + Arrays.toString(ans));

    }

    public static int[] delete(int[] arr, int numberToDelete) {
        int occ = OccurencesArray.noOfOccurences(arr, numberToDelete);
        if (occ == 0) {
            return arr;
        }
        int size = arr.length - occ;
        int[] newArr = new int[size];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != numberToDelete) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
}
