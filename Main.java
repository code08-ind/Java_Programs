package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int age;
        System.out.print("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        boolean tell = (age>=18);
        if (tell) {
            System.out.println("Rohan Can Drive");
        } else {
            System.out.println("Rohan Cannot Drive");
        }
    }
}
