package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class MoveNonZeroBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,0,6,0};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];
        int index = 0;
        int newIndex = 0;
        while(index < arr.length){
            if(arr[index] != 0)
            {
                newArr[newIndex] = arr[index];
                newIndex++;
            }
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
