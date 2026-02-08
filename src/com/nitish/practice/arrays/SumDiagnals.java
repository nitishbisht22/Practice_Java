package com.nitish.practice.arrays;

import java.util.Arrays;

public class SumDiagnals {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2 , 3 , 4},
                {3 , 4}
        };
        search(arr);

    }
    public static void search(int[][] arr) {
     int count = arr.length;
       System.out.println("Row size is: " + count);
       // Till here it counts the row whether it is even or odd.
        // Check if the row is even or odd.

        if(count % 2 == 0)
        {
            int sum = 0;
            int evenRow = 0;
            int evenCol = 0;
            int i = 0;
            while(evenRow < arr.length){
                int length = arr[evenRow].length;
                while(evenCol < arr.length){
                    sum = sum + arr[evenRow][evenCol] + arr[evenRow][length - i - 1];
                    evenCol++;
                    i++;
                    evenRow++;
                }
                evenRow++;
            }
            System.out.println(sum);
        }
        else {
            int sum = 0;
            int evenRow = 0;
            int evenCol = 0;
            int i = 0;
            int breakingCondition = (count / 2);
            while(evenRow < arr.length){
                int length = arr[evenRow].length;
                while(evenCol < arr.length){
                    if(evenRow == breakingCondition){
                        sum = sum + (arr[evenRow][evenCol] + arr[evenRow][length - i - 1]) - (arr[evenRow][length - i - 1]);
                        evenRow++;
                        evenCol++;
                        i++;
                    }
                    else{
                        sum = sum + arr[evenRow][evenCol] + arr[evenRow][length - i - 1];
                        evenCol++;
                        evenRow++;
                    }

                }
                evenRow++;

            }
            System.out.println(sum);
        }
    }
}
