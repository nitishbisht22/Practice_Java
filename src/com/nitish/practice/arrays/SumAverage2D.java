package com.nitish.practice.arrays;

import java.util.Arrays;

public class SumAverage2D {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2 , 4},
                {3, 6},
        };
       search(arr);
    }
    public static void search(int[][] arr) {
        int sum = 0;
        int count = 0;
        int row = 0;
        while(row < arr.length) {
            int col = 0;
            while(col < arr[row].length) {
                sum = sum + arr[row][col];
                col++;
                count++;
            }
            row++;
        }
        double average = (double) sum / count;
        System.out.println("the sum is " + sum);
        System.out.println("the average is " + average);
    }
}
