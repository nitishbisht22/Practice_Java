package com.nitish.practice.utils;

public class AddSpace {
    public static void main(String[] args) {
        String str = "   Hello   World   Java   ";
        String result = removeExtraSpaces(str);
        System.out.println(result);
    }

    public static String removeExtraSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        boolean spaceSeen = false; // track prev char space tha ya nahi
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
                spaceSeen = false; // reset
            }
            else{
                // agar pehle space nahi tha aur sb empty nahi hai
                if(!spaceSeen && sb.length() > 0){
                    sb.append(' ');
                    spaceSeen = true;
                }
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
