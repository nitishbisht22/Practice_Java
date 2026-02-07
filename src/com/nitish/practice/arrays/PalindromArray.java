package com.nitish.practice.arrays;

import com.nitish.practice.utils.NewUtility;
import java.util.Arrays;

public class PalindromArray {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome array");
        int[] arr = NewUtility.inputArray();
        boolean ans = isPalindrome(arr);
        if (ans)
            System.out.println("Hence , it is a palindrome array");
        else {
            System.out.println("Hence , it is not a palindrome array");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        System.out.println("New array is : " + Arrays.toString(arr));
        return true;

    }
}
