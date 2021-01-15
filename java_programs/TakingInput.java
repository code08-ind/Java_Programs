package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User:");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number One : ");
//        boolean b1 = sc.hasNextInt();//it looks that if the value we
//        // have entered is int or not and similar for other data types
//        System.out.println(b1);
//        int a = sc.nextInt();
//        System.out.println("Enter Number Two : ");
//        int b = sc.nextInt();
//        int c = a + b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("Sum Of Both The Numbers Is : ");
//        System.out.println(c);
//        String str = sc.next();//it doesn't read spaces in a string but only reads a word before a space
        String str = sc.nextLine();//it takes all the words of a string with spaces also
        System.out.println(str);
    }
}
