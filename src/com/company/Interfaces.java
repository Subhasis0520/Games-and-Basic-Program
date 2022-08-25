package com.company;


interface Bicycle{
    int a = 25;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 20;
    void blowHornK3g();
    void blowHornhahk();
}

class AvonCycle implements Bicycle, HornBicycle{

    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
        int speed;
        speed = a - decrement;
        System.out.println("After applyin brake speed is " + speed);
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("Suraj hua madhyam pee pee pee pee");
    }
    public void blowHornhahk(){
        System.out.println("Hum apke hain kaun po po po po");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.applyBrake(4);


        System.out.println("Original speed is " + c.a);
        System.out.println(c.x);

        c.blowHornK3g();
        c.blowHornhahk();
    }
}





