package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Enter Size Of Array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[];
        a = new int[n];
        System.out.println("Enter Elements Of Array One By One : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            sum = sum + a[j];
        }
        System.out.println("Sum Of Elements Of Array Is : " + sum);
    }
}
