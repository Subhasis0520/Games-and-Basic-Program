package com.company;
abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of class parent");
    }
   abstract public void greet2();
}
class Child extends Parent {
    @Override
    public void greet2() {
        System.out.println("Good morning");
    }
}
abstract class Child2 extends Parent{
    public void m6(){
        System.out.println("I am good");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
Child c = new Child();
    }
}
