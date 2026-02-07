package com.nitish.practice.math;

import com.nitish.practice.utils.NewUtility;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Hello , welcome to reverse of a number");
        int[] num = NewUtility.inputArray();
        reverse(num);
        System.out.println("The reversed array is: " + Arrays.toString(num));

    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
