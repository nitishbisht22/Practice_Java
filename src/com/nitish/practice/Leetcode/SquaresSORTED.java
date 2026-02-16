package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class SquaresSORTED {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] ans = sortedSquares(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int firstSquare = 0;
        int secondSquare = 0;
        int[] newArr = new int[nums.length];
        int index = nums.length - 1;
        while(i <= j){
            firstSquare = nums[i] * nums[i];
            secondSquare = nums[j] * nums[j];
            if(firstSquare > secondSquare){
                newArr[index] = firstSquare;
                index--;
                i++;
            }
            else{
                newArr[index] = secondSquare;
                index--;
                j--;
            }
        }
        return newArr;
        }

}
