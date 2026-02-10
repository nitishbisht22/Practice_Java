package com.nitish.practice.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 7 , 7 , 5};
        int ans = findLargest(arr);
        System.out.println(ans);
    }

    public static int findLargest(int[] arr) {
        // Complexity 0(2n)
       /* int index = 0;
        int max = arr[0];
        while(index < arr.length){
            if(arr[index] > max)
            {
                max = arr[index];
            }
            index++;
        }
        int secondLargest = -1;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > secondLargest && arr[i] != max){
                secondLargest = arr[i];
            }
            i++;
        }
        return secondLargest;
    }
        */

        //complexity -

        int index = 0;
        int max = arr[0];
        int secondMax = -1;
        while(index < arr.length){
            if(arr[index] > max){
                secondMax = max;
                max = arr[index];
            }
            else {
                if(arr[index] < max && arr[index] > secondMax ){
                    secondMax = arr[index];
                }
            }
            index++;
        }
        return secondMax;
    }

}
