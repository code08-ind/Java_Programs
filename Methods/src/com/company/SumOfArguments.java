package com.company;

public class SumOfArguments {
    static int arg(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println("Avg Of Arguments Passed In Function Is : " + arg(1, 2, 3));
    }
}
