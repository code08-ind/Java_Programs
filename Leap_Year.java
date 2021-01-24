package com.company;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter Year You Want To Find Out : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Year Is Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Year Is Not Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println("Year Is Leap Year");
        }
        else {
            System.out.println("Year Is Not Leap Year");
        }
    }
}
