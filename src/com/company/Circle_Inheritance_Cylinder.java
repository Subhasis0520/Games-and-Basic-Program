package com.company;
class Circle{
    int radius;

    Circle(int r){
        this.radius =r;
        System.out.println("I am a constructor of Circle class");
    }
    double area(int r){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder2 extends Circle{
    int height;
    Cylinder2(int r, int h){
        super(r);
        System.out.println("I am a constructor of Cylinder class");
        this.height =h;
    }
    double area(int r, int h){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class Circle_Inheritance_Cylinder {
    public static void main(String[] args) {
      //Circle c = new Circle();
        Cylinder2 obj = new Cylinder2(4,12);

    }
}
