package com.class7;

import java.util.Scanner;

/**
 * functions5
 */
public class functions5 {

    public static void PrimeNumber(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime Number");
                break;
            }
        }
        if (n % i == 0) {
            System.out.println("Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        PrimeNumber(n);
    }
}