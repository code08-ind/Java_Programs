package com.company;

public class Practice7_Arrays {
    public static void main(String[] args) {
        int arr[] = {2, 3, 8, 5, 6};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array Is Sorted");
        } else {
            System.out.println("Array Is Not Sorted");
        }
    }
}
