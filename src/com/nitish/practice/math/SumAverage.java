package com.nitish.practice.math;

import com.nitish.practice.arrays.ArrayUtility;
import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int[] numsArray = ArrayUtility.inputArray();
        long sum = sum(numsArray);
        double average = average(numsArray);
        System.out.println("the sum is " + sum);
        System.out.println("the average is " + average);

    }

    public static long sum(int[] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] arr) {
        long useSum = sum(arr);
        double average = (double) useSum / arr.length;
        return average;
    }
}
