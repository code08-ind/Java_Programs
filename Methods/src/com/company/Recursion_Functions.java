package com.company;

import java.util.Scanner;

public class Recursion_Functions {
    static int factorial(int n) {
        int fact;
        if (n == 1 || n == 0) {
            fact = 1;
        } else {
            fact = factorial(n - 1) * n;
        }
        return fact;
    }

    public static void main(String[] args) {
        int inp;
        int fac;
        System.out.println("Enter The Number Whose Factorial You Want To Calculate : ");
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();
        fac = factorial(inp);
        System.out.println("Factorial Of Number Is : " + fac);
    }
}
