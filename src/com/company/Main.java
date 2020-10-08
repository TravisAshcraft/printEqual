package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        PrinterEqual printerEqual = new PrinterEqual();

        System.out.println("Enter three different or same numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();

        printerEqual.printEqual(x,y,n);

    }
}
