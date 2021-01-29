package com.company;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int num, result;
        System.out.println("Enter The Term You Want The In The Fibonacci Series : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        result = fibo(num);
        System.out.println("Nth Term Of Fibonacci Series Is : " + result);
    }
}
