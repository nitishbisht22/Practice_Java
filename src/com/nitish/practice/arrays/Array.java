package com.nitish.practice.arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = {3, 6 , 8 , 87 , 65 , 4 , 68 , 23 , 9 , 98 , 34, 56};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number u want to search : ");
        int num = input.nextInt();
        boolean isFound = isFount(arr , num);
        if(isFound){
            System.out.println("Your number was found in the array");
        }
        else {
            System.out.println("Your number was not found in the array");
        }
    }
    public static boolean isFount(int[] arr , int number){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == number){
                return true;
            }
            index++;
        }
        return false;
    }
}
