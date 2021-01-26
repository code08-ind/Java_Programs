package com.company;

public class Star_Pattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {//for(i=4;i>0;i--)
            for (j = 4; j >= i; j--) {//for(j=0;j<i;j++)
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
