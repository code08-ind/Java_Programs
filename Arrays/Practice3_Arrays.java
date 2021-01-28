package com.company;

public class Practice3_Arrays {
    public static void main(String[] args) {
        int arr[] = {50, 60, 70, 80, 90};
        int avg;
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        avg = sum / arr.length;
        System.out.println("Avg. Marks Are : " + avg);
    }
}
