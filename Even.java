package com.company;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter The Number Till You Want To Print Even Numbers : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(2*i);
        }
    }
}
