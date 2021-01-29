package com.company;

public class Method_Overload {
    static void change(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    //this will work if we have ipper function
//    static int change(int a,int b,int e) {
//        int c = a*b*e;
//        System.out.println(c);
//        return c;
//    }
    static void change(int a, int b, int c) {
        int d = a * b * c;
        System.out.println(d);
    }
    //will not work as it is not overloading
//    static int change(int a,int b,int c) {
//        int d = a*b*c;
//        System.out.println(d);
//        return d;
//    }

    public static void main(String[] args) {
        //int array[] = {1, 2, 3, 4, 5};//array object is created and array is just it;s reference so
        //the value will get changed.
        //change(array);
        //System.out.println(array[0]);
        int d = 2;
        int e = 3;
        int f = 4;
        change(d, e);
        change(d, e, f);
    }
}
