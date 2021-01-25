package com.company;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        int n;
        int i;
        System.out.println("Enter Value Of n To Find First n  Odd Numbers : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i < 2 * n; i+=2) {
            System.out.println(i);
        }
    }
}
