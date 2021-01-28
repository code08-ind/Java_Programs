package com.company;

public class Practice6_Arrays {
    public static void main(String[] args) {
        int arr[] = {123, 34, 12, 3, 43};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Min Element Of Array Is : " + min);
    }
}
