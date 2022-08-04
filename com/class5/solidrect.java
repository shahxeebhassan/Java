package com.class5;

import java.util.Scanner;

// Solid Rectangle
public class solidrect {
    public static void main(String[] args) {
        //Taking input from user
        System.out.println("Rows of rectangle ?: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Columns of rectangle?: ");
        int columns = sc.nextInt();
        // Outer loop for y-axis or rows 
         for (int i = 1; i <= rows; i++) {
            // Inner loop for x-axis or columns
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
