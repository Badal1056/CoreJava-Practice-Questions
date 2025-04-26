package com.inheritence;

class AA {
    int i=10;
}
class BB extends AA {
    int i=20;
    void  m2() {
        System.out.println(i);
        System.out.println(super.i);
    }
}
class CC extends BB {
    int i=30;
    void m3() {
        m2();
        System.out.println(i);
        System.out.println(super.i);
    }
}
public class A {
    public static void main (String[] args){
        CC c= new CC();
        c.m3();
    }
}