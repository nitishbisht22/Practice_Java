package com.nitish.practice.arrays;

public class plants {
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 2, 3, 2, 5, 1, 7};
        int ans = minimumRefill(arr, 6, 7);
        System.out.println(ans);
    }

    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0;
        int j = plants.length - 1;
        int refill = 0;
        int canA = capacityA;
        int canB = capacityB;
        while(i < j){
            if(canA < plants[i]){
                refill++;
                canA = capacityA;
            }
            if(canB < plants[j]){
                refill++;
                canB = capacityB;
            }
            canA = canA - plants[i];
            canB = canB - plants[j];
            i++;
            j--;
        }

        if(i==j){
            if(canA<plants[i] && canB<plants[j]){
                refill++;
            }
        }
        return refill;
    }
}