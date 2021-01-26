package com.company;

public class Multiplication_Table {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Enter The Number Till You Want The Table : ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
