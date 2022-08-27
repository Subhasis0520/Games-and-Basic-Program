package com.company;
   class Monkey {
       void jump() {
           System.out.println("Jumping");
       }

       void bite() {
           System.out.println("Bitting");
       }
   }
   class Human extends Monkey implements BasicAnimal{
void speak(){
    System.out.println("Hi...");
}

       @Override
       public void eat() {
           System.out.println("Eating..");
       }

       @Override
       public void sleep() {
           System.out.println("Sleeping...");
       }
   }
 interface BasicAnimal{
       void eat();
       void sleep();

 }
public class Qestion1 {
    public static void main(String[] args) {
        // Polymorphism Demostration
   Monkey m = new Human();
   m.bite();
   m.jump();

   BasicAnimal ba = new Human();
   ba.eat();
   ba.sleep();
    }
}
