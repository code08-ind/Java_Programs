package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        int fact = 1;
        System.out.println("Enter The Number Whose Factorial You Want : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n == 0 || n == 1) {
                fact = fact;
            } else {
                fact = fact * i;
            }
        }
        System.out.println("Factorial Is : " + fact);
    }
}
