package com.company;

public class PrinterEqual {

    public static void printEqual(int x, int y, int n){
        if(x < 0 || y < 0 || n < 0){
            System.out.println("Invalid Value");
        }
        else if(x == y && y == n){
            System.out.println("All numbers are equal");
        }
        else if(x != y && y != n && n != x){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }

}
