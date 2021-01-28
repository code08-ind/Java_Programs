package com.company;

public class Practice5_Arrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 9, 4, 43};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max Element Of Array Is : "+max);
    }
}
