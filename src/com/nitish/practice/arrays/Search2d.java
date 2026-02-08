package com.nitish.practice.arrays;

import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        int[] ans = search(arr, 12);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int[][] arr, int target) {
        int row = 0;
        while( row < arr.length) {
            int col = 0;
            while(col <  arr[row].length) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
                col++;
            }
            row++;
        }
        return new int[]{-1, -1};
    }
}
