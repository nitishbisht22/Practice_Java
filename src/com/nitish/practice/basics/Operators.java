package com.nitish.practice.basics;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.print("Enter first number : ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        System.out.print("Enter second number : ");
        int second = input.nextInt();

        int addtion = first + second;
        int subtraction = first - second;
        int multiplication = first * second;
        int division = first / second;
        int remainder = first % second;

        System.out.println("Addition is: " + addtion);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multiplication is: " + multiplication);
        System.out.println("Division is: " + division);
        System.out.println("Remainder is: " + remainder);

    }
}
