package com.company;

public class Sum {
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 7, 8};
        int sum = 0;

        for (int x : nums) {
            sum = sum + x;
        }
        System.out.println("Sum Of The Elements Of The Array Is : " + sum);
    }
}
