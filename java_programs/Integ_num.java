package com.company;

import java.util.Scanner;

public class Integ_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value : ");
        boolean b1 = sc.hasNextInt();
        if (b1) {
            System.out.println("The User Entered Integer Value");
        } else {
            System.out.println("The User Didn't Entered Integer Value");
        }
    }
}
