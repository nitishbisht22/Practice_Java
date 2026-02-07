package com.nitish.practice.math;
public class GCD {
    public static void main(String[] args) {
        int ans = gcd(2 , 10);
        System.out.println(ans);

    }
    public static int gcd(int a, int b) {
        int i = 1;
        int ans = 0;
        while(i <= Math.min(a,b))
        {
            if(a % i == 0 && b % i == 0)
            {
                ans = i;
            }
            i++;
        }
        return ans;
    }
}
