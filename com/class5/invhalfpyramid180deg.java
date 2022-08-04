package com.class5;

import java.util.Scanner;

public class invhalfpyramid180deg {
    public static void main(String[] args) {
        // inverted half pyramid with 180 degrees
        System.out.println("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
