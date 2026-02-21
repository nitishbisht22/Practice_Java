package com.nitish.practice.utils;

public class reverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        String p = reverseVowels(s);
        System.out.println(p);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        int i = 0;
        while(i < j) {
            while (i < j){
                if(isVowel(chars[i])){
                    break;
                }
                i++;
            }
            while (i < j){
                if(isVowel(chars[j])){
                    break;
                }
                j++;
            }
            swap(chars, i , j);
            i++;
            j--;
        }
        return String.valueOf(chars);
        }

        public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        }
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}