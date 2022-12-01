package com.Shahzaib.Singleton;

public class Singleton {
    private Singleton() {
        System.out.println("Object Created");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}