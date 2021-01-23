package com.company;

public class Array_For_Each {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
            if(i==3){
                break;
            }
        }
        System.out.println("Sum Of Elements Of Array Is : " + sum);
    }
}
