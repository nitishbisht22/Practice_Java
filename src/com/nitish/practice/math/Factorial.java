package com.nitish.practice.math;
public class Factorial {
    public static void main(String[] args) {
        factorial(5);

    }

    public static void factorial(int n)
    {
        int i = 1;
        int ans = 1;
        while(i <= n)
        {
            ans  = ans * i;
            i++;
        }

        System.out.println(ans);
    }
}
