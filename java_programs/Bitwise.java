package com.company;

public class Bitwise {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("a&b : " + (a & b));
        System.out.println("\n");
        System.out.println("a|b : " + (a | b));
        System.out.println("\n");
        System.out.println("a^b : " + (a ^ b));
        System.out.println("\n");
        System.out.println("~b : " + (~b));
        System.out.println("\n");
        a = a&b;
        System.out.println("a= : " + (a));
    }
}
