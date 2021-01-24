package com.company;

import java.util.Scanner;

public class Practice_Pr3 {
    public static void main(String[] args) {
        int income;
        int tax;
        System.out.println("Enter Your Income : ");
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();
        if (income < 250000) {
            System.out.println("No Tax Need To Be Payed");
        } else if (income > 250000 && income <= 500000) {
            tax = income * 5 / 100;
            System.out.println("Tax To Be Payed Is : " + tax);
        } else if (income > 500000 && income <= 1000000) {
            tax = (250000 * 5 / 100) + ((income - 500000) * 20 / 100);
            System.out.println("Tax To Be Payed Is : " + tax);
        } else {
            tax = (250000 * 5 / 100) + (500000 * 20 / 100) + (income - 1000000) * 30 / 100;
            System.out.println("Tax To Be Payed Is : " + tax);
        }
    }
}
