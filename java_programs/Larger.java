package com.company;

public class Larger {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if (num1 > num2) {
            System.out.println("First Number " + num1 + "Is Larger.");
        } else if (num1 < num2) {
            System.out.println("Second Number " + num2 + "Is Larger.");
        } else {
            System.out.println("Both The Numbers Are Equal.");
        }
    }
}
