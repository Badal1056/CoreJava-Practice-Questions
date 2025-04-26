package com.inheritence;

class A1 {
    int i=10;
    void m1(){
        System.out.println("M1-A");
    }
}
class B extends A1 {
    int j=20;
    void  m2() {
        System.out.println("M2-B");
    }
}
class C extends B{
    int k=30;
    void m3() {
        System.out.println("M3-C");
    }
}
public class demo{
    public static void main (String[] args){
        A1 a= new A1();
        System.out.println(a.i);
        a.m1();
        
        B b= new B();
        System.out.println(b.i);
        System.out.println(b.j);
        b.m1();
        b.m2();
        
        C c= new C();
        System.out.println(c.i);
        System.out.println(c.j);
        System.out.println(c.k);
        c.m1();
        c.m2();
        c.m3();
    }
}
