package com.nitish.practice.math;
public class OddNumbers {
    public static void main(String[] args) {
        int ans = odd(1 , 10);
        System.out.println(ans);

    }
    public static int odd(int a , int b){
        int i = a;
        int ans = 0;
        while(i <= b)
        {
            if(i % 2 != 0)
            {
               ans = ans + i;
            }
            i++;
        }
        return ans;
    }
}
