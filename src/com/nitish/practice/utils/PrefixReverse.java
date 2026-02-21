package com.nitish.practice.utils;

public class PrefixReverse {
    public static void main(String[] args) {
        String s = "abcdefd";
        String str = reversePrefix(s , 'd');
        System.out.println(str);

    }
    public static String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==ch){

                int start = 0;
                int end = i;

                while(start < end){
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                break;
            }
        }
    return new String(arr);
    }
}
