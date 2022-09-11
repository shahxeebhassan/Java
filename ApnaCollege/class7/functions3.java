package com.class7;

import java.util.Scanner;

// function to multiply two numbers and return product
public class functions3 {
    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
        // return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        // int Product = calculateProduct(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is " + calculateProduct(num1, num2));
    }
}
