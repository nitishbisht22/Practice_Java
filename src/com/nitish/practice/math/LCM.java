package com.nitish.practice.math;
public class LCM {
    public static void main(String[] args) {
       int ans = lcm(15,20 );
        System.out.println(ans);

    }
    public static int lcm(int a, int b) {
        int i = 1;
        while(i <= b)
        {
            int factor = a * i;
            if(factor % b == 0){
                return factor;
            }
            i++;
        }
        return 0;

    }
}
