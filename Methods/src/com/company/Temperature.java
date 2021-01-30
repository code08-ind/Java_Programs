package com.company;

import java.util.Scanner;

public class Temperature {
    static float convert(float cel) {
        float fah;
        fah = ((cel * 9.0f) / 5.0f) + 32.0f;
        return fah;
    }

    public static void main(String[] args) {
        float celsius;
        System.out.println("Enter Temperature In Celsius : ");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextFloat();
        System.out.println("Temperature In Celsius Is : " + celsius);
        System.out.println("Temperature In Fahrenheit Is : " + convert(celsius));
    }
}
