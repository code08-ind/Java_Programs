package com.company;

import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
        int flats[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                flats[i][j] = sc.nextInt();
            }
        }
        System.out.println("Two Dimensional Array Is : ");
        for (int i = 0; i < 2; i++) {//for(int i=0;i<flats.length;i++)
            for (int j = 0; j < 3; j++) {//for(int j=0;j<flats[0].length;j++)
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
