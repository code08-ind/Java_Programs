package com.company;
class A{
    public int a;
    public int get(int a){
        return a;
    }
    public void meth1(){
        System.out.println("Hello World");
    }
    public void meth2(){
        System.out.println("Method Of Class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("Method Of Class B");
    }
    public void meth3(){
        System.out.println("Bye Bye");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        a.meth2();
        System.out.println(a.get(4));
        B b = new B();
        b.meth2();
        b.meth3();
    }
}
