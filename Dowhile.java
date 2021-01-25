package com.company;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        int i = 1;
        int n;
        System.out.println("Enter Value Of n To Find All Natural Numbers Till n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
