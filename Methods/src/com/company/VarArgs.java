package com.company;

public class VarArgs {
    static int sum(int x, int ...arr) {//
        //available as int arr[]
        int sum = x;
        for (int a : arr) {
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome To Varargs Tutorial.");
        System.out.println("The Sum Of Numbers Is : " + sum(2, 3, 5, 67, 8));
        System.out.println("The Sum Of Numbers Is : " + sum(4));
        System.out.println("The Sum Of Numbers Is : " + sum(1,2));
    }
}
