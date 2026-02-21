package com.nitish.practice.utils;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);

    }
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        swap(s , start , end);
        System.out.println(s);
    }
    public static void swap(char[] s , int start , int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
