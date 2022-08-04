package com.class3;
import java.util.Scanner;

public class conditional2{
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Number 1 is greater");
        } else if (num1 < num2) {
            System.out.println("Number 2 is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

    }
}