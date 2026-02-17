package com.nitish.practice.arrays;

public class MaxArea {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);

    }
    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int width = j - i ;
            int newHeight = Math.min(height[i] ,  height[j]);
            int area = width * newHeight;
            max = Math.max(area,max);
            if (height[i] < height[j]) {
                i++;
            }
            else if (height[i] > height[j]) {
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return max;
    }
}
