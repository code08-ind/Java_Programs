package com.company;

public class Practice4_Arrays {
    public static void main(String[] args) {
        int arr[] = {20, 30, 40, 50, 60};
        System.out.println("Array In Reversed Order Is : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
