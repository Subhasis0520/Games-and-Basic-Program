package com.company;
class Rectangle{
    private int length;
    private int breath;

    public Rectangle() {
        this.length = 4;
        this.breath = 5;
    }
    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}

 public class Constructor {
     public static void main(String[] args) {
    Rectangle rc = new Rectangle();
         System.out.println(rc.getBreath());
         System.out.println(rc.getLength());


     }
}