package com.company;
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class Dynamic_Dispatch {
    public static void main(String[] args) {

        Phone obj = new SmartPhone();

        obj.greet();
        obj.on();

}

}
