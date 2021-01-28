package com.company;

public class Practice1_Arrays {
    public static void main(String[] args) {
        float arr[] = {2.3f, 1.2f, 2.3f, 1.2f, 2.3f};
        float sum = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum Of Array Elements Is : " + sum);
    }
}
