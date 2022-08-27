package com.company;
 abstract class TelePhone{
    abstract public void ring();
    abstract public void lift();
    abstract public void diconnect();

     }
     class SmartTelePhone extends TelePhone{
         @Override
         public void ring() {
             System.out.println("Ringing....");
         }

         @Override
         public void lift() {
             System.out.println("Lift the phone");
         }

         @Override
         public void diconnect() {
             System.out.println("Please disconnect the phone");
         }
     }
public class Question2 {
    public static void main(String[] args) {
        SmartTelePhone std = new SmartTelePhone();
        std.lift();;
        std.diconnect();
        std.ring();

    }
}
