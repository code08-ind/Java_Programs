package com.company;

import java.util.Scanner;

public class Array_Implementation {

    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[5];
        System.out.println("Enter Elements Of Array One By One : ");
        // Array Elements Could Be Changed And Could Be Accessed.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements Of Array Are : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + arr.length);
    }
}
