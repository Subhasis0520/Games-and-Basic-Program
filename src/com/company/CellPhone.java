package com.company;

public class CellPhone {
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("CallFriend...");
    }

    public static void main(String[] args) {
        CellPhone poco = new CellPhone();
        poco.ringing();
        poco.callFriend();
        poco.vibrating();
    }
}
