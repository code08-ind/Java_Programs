package com.company;

class Test {
    int i, j;

    Test(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void print() {
        System.out.println(i);
        System.out.println(j);
    }

    void increase(int i, int j) {
        i = i + 2;
        j = j * 2;
    }
}

public class Parameter_Pass {
    public static void main(String[] args) {
        Test t1 = new Test(10, 10);
        t1.print();
        t1.increase(t1.i,t1.j);
        t1.print();
    }
}
