package com.class5;

import java.util.*;

// Bare Minded
public class hollowrect1 {

    public static void main(String[] args) {
        System.out.println("Enter width of rectangle: ");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.println("Enter height of rectangle: ");
        int height = sc.nextInt();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == width || j == 1 || j == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
