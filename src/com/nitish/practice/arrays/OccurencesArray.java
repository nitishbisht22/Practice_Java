package com.nitish.practice.arrays;
import java.util.Scanner;

public class OccurencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array occurences");
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find");
        int number = input.nextInt();
        int ans = noOfOccurences(arr , number);
        System.out.println("Your number was found : " + ans + " in the array");
    }

    public static int noOfOccurences(int[] arr , int num){
        int occurences = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num)
            {
                occurences++;
            }
            i++;
        }
        return occurences;
    }
}
