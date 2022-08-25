package com.company;

    class Abhi{
        public int a;
        public int meth(){
            return 4;
        }
        public void meth2(){
            System.out.println("I am method 2 of class A");
        }
    }

    class Bad extends Abhi{
        @Override
        public void meth2(){
            System.out.println("I am method 2 of class B");
        }
        public void meth3(){
            System.out.println("I am method 3 of class B");
        }
    }

public class Method_Overriding {
    public static void main(String[] args) {
        Abhi a = new Abhi();
        a.meth2();

        Bad b = new Bad();
        b.meth2();
    }
}




