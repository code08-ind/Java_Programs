package com.company;
class A{
    public void print(){
        System.out.println("This Is The Print Function Of Base Class.");
    }
}
class B extends A{
    public void print(){
        super.print();
        System.out.println("This Is The Print Function Of Inherited Class.");
    }
}
public class OverridingSuper {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.print();
        b.print();
    }
}
