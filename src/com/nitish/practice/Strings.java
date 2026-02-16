package com.nitish.practice;

public class Strings {
    public static void main(String[] args) {
/*
        String s1 = new String("Nitish");
        String s2 = new String("Nitish");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); //true


        StringBuffer sb = new StringBuffer("Nitish");
        StringBuffer sb2 = new StringBuffer("Nitish");
        System.out.println(sb == sb2);// false
        System.out.println(sb.equals(sb2)); //false



        String s3 = new String("Nitish");
        String s4 = new String("Nitish");
        String s5 = "Nitish";
        String s6 = "Nitish";


        String s7 = new String("Nitish");
        s7.concat("Software");
        s7 = s7.concat("Solutions");

 */

/*
        String s8 = new String("Spring");
        s8.concat("Fall");
        String s9 = s8.concat("winter");
        s9.concat("Summer");
        System.out.println(s8);
        System.out.println(s9);

 */

        String s1 = new String("You can't change me");
        String s2 = new String("You can't change me");
        System.out.println(s1 == s2);

        String s3 = new String("You can't change me");
        System.out.println(s1 == s3);
        String s4 = "You can't change me";
        System.out.println(s3 == s4);
        String s5 = "You can't " + "change me";
        System.out.println(s4 == s5);

        String s6 = "You can't ";
        String s7 = s6+"change me";

        System.out.println(s4==s7);

        final String s8 = "You can't ";
        String s9 = s8+"change me";
        System.out.println(s4==s9);




    }
}
