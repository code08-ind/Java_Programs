package com.company;

public class Static_Use {
    static int a = 3;
    static int b;

    static void print(int x) {
        System.out.println(x);
        System.out.println(a);
    }

    static {
        System.out.println("Hello World!");
        b = a * 4;
        System.out.println(b);
    }

    public static void main(String[] args) {
        print(40);
    }
}
