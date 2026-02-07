package com.nitish.practice.math;
public class Multiplication {
    public static void main(String[] args) {
        multiply(5);
    }

    public static void multiply(int a){

        int number = a;
        int i = 1;
        while(i <= 10)
        {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
            i++;
        }

    }

}
