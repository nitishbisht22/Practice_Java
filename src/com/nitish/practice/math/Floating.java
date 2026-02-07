package com.nitish.practice.math;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Floating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        double ans = first + second;
        System.out.print("The answer is: " + ans);

    }
}
