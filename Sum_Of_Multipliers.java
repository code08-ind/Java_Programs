package com.company;

public class Sum_Of_Multipliers {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        System.out.println("Enter The Number Till You Want The Table : ");
        for (int i = 10; i >= 1; i--) {
            sum = sum + (n * i);
        }
        System.out.println("Sum Is : " + sum);
    }
}
