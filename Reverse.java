package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        int i;
        System.out.println("Enter Value Of n To Find First n  Odd Numbers : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = n; i != 0; i--) {
            System.out.println(i);
        }
    }
}
