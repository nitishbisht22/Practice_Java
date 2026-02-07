package com.nitish.practice.basics;
public class Function {
    public static void main(String[] args) {
        greeting();

    }
    public static void greeting(){
       int rows = 0; //intialiasation
       while(rows < 5) // condition
       {
           System.out.print("*");
           int patterns = 0;
           while(patterns < rows){
               System.out.print(" *");
               patterns++;
           }
           System.out.println();
           rows++; //updation
       }
    }
}
