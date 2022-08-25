package com.company;
class MyCylinder{
    private int  radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float surfaceArea(){
        return (float) (2*3.142*radius*radius + 2*3.142*radius*height);
    }
    public float volume(){
        return (float) (2*3.142*radius*radius*height);
    }
}
public class Cylinder {
    public static void main(String[] args) {
        MyCylinder cy = new MyCylinder();
        cy.setRadius(12);
        System.out.println(cy.getRadius());
        cy.setHeight(10);
        System.out.println(cy.getHeight());
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());
    }
}
