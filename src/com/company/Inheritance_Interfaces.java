package com.company;
  interface Sample1{
    void m1();
    void m2();
}
  interface Sample2 extends Sample1{
    void m3();
    void m4();
}
class MySample implements Sample2{
    @Override
    public void m1() {
        System.out.println("I am 1st method");
    }

    @Override
    public void m2() {
        System.out.println("I am 2nd method");
    }

    @Override
    public void m3() {
        System.out.println("I am 3rd method");
    }

    @Override
    public void m4() {
        System.out.println("I am 4th method");
    }
}
public class Inheritance_Interfaces {
    public static void main(String[] args) {
        MySample obj = new MySample();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();

    }
}
