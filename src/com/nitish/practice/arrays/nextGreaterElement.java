package com.nitish.practice.arrays;

public class nextGreaterElement {
    public static void main(String[] args) {
        int n = 21;
        int ans = nextGreater(n);
        System.out.println(ans);

    }
    public static int nextGreater(int n) {
        char[] ch = getDigits(n);
        int i = ch.length-1;
        int j  = ch.length - 1;
        while (i >= 0) {
            if( i == 0){
                return -1;
            }
            else if(ch[i] > ch[i - 1]){
                int ans = nextGreater2(ch , i - 1 , i , j);
                swap(ch , i - 1 , ans);
                reverse(ch , i , j);
                break;
            }
            i--;
        }
        long val = Long.parseLong(new String(ch));
        if(val > Integer.MAX_VALUE) {
            return -1;
        }
        int num = (int) val;
            return num;
    }
    public static char[] getDigits(int n){
        return String.valueOf(n).toCharArray();
    }

    public static void reverse(char[] ch, int start, int end){
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    public static int nextGreater2(char[] n , int pivot , int start , int end) {
        for(int k = end ; k >= start ; k--){
            if(n[k] > n[pivot]){
                return k;
            }
        }
        return pivot;
    }

    public static void swap(char[] n, int i, int j) {
        char temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}
