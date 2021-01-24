package com.company;

class Change {
    int a;

    Change(int a) {
        this.a = a;
    }

    Change increaseAmount(Change c1) {
        Change c2 = new Change(c1.a + 10);
        return c2;
    }
}

public class Return_Obj {
    public static void main(String[] args) {
        Change c3 = new Change(12);
        Change c4;
        System.out.println(c3.a);
        c4 = c3.increaseAmount(c3);
        System.out.println(c4.a);
        c4 = c4.increaseAmount(c4);
        System.out.println(c4.a);
    }
}
