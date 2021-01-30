package com.company;

import java.util.Scanner;

public class StarPattern {
    static void get(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter The Number Of Rows : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Star Pattern For " + num + " Rows is : ");
        get(num);
    }
}
