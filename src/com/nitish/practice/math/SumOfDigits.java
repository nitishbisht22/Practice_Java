package com.nitish.practice.math;
public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumDigits(1234);
        System.out.println(ans);

    }

    public static int sumDigits(int n) {
        int sum = 0;
        while(n > 0)
        {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
}
