package com.nitish.practice.arrays;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);

    }
    public static void sortColors(int[] nums) {
        // Brute Force
        /*
        int[] newArr = new int[nums.length];
        int i = 0;
        int countOnes = 0;
        int countzeros = 0;
        while (i < nums.length){
            if(nums[i] == 0){
                countzeros++;
            }
            else if(nums[i] == 1){
                countOnes++;
            }
            i++;
        }

        int startIndex = 0;
        int endIndex = countzeros + countOnes;


        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 0){
                newArr[startIndex] = nums[j];
                startIndex++;
            }
            else if(nums[j] == 1){
                newArr[countzeros] = nums[j];
                countzeros++;
            }
            else{
                newArr[endIndex] = nums[j];
                endIndex++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }

         */
        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        while(k <= j){
            if(nums[k] == 0){
                swap(nums, i, k);
                i++;
            }
            else if(nums[k] == 2){
                swap(nums, j, k);
                j--;
            }
            else{
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

        public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

}
