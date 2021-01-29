package com.company;

import java.util.Scanner;

public class Fibonacci_Series {
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter The Term You Want The Fibonacci Series Till : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Fibonacci Series Is : ");
        for (int i = 0; i < num; i++) {
            fibo(i);
            System.out.print(fibo(i) + " ");
        }
    }
}
