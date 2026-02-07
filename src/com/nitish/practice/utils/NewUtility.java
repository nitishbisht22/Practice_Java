package com.nitish.practice.utils;
import java.util.Arrays;
import java.util.Scanner;

public class NewUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < size)
        {
            System.out.print("Enter your " + (i + 1 ) + " element: " );
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Your array is " + Arrays.toString(arr));
        return arr;
    }

}
