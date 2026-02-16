package com.nitish.practice.Leetcode;

import java.util.Arrays;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-16,30,18,28};
        firstNegative(arr , 3);
    }
    public static void firstNegative(int[] nums , int k) {

        /*
        int i = 0;

        int j = 0;
        int index = 0;
        int trackingPointer = 0;
        int[] newArr = new int[nums.length - k + 1];
        while(j < nums.length){
            if(j - i + 1 == k)
            {
                while(trackingPointer <= j)
                {
                    if(nums[trackingPointer] < 0)
                    {
                        newArr[index] = nums[trackingPointer];
                        index++;

                        break;
                    }
                    trackingPointer++;
                }
                i++;
                trackingPointer = i;
            }
            j++;
        }
        System.out.println(Arrays.toString(newArr));
        return newArr[newArr.length - 1];
    }
    */
        int[] newArr = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0 ; i < nums.length - k ; i++){
            boolean found = false;
            for(int j = i ; j < i + k ; j++){
                if(nums[j] < 0){
                    newArr[index] = nums[j];
                    found = true;
                    index++;
                    break;
                }
            }
            if(!found){
                newArr[index] = 0;
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
