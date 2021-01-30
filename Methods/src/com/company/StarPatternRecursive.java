package com.company;

import java.util.Scanner;

public class StarPatternRecursive {
    static void printStar(int n) {
        if (n > 0) {
            printStar(n - 1);
            for (int i =0; i < n; i++) {
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
        printStar(num);
    }
}
