package com.company;

import java.util.Scanner;

public class Practice2_Arrays {
    public static void main(String[] args) {
        int a;
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Enter The Element You Want To Search For : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        boolean isInArray = false;
        for (int j : arr) {
            if(a==j) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Element Is In Array");
        }
        else{
            System.out.println("Element Is Not In Array");
        }
    }
}
