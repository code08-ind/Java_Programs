package com.company;

import java.util.Scanner;

public class Multiplication_Table {
    static void printTable(int n) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter The Number Whose Table You Want : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Table Of Number " + num + " is : ");
        printTable(num);
    }
}
