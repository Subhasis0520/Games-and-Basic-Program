package com.company;

public class TommyVecetti {
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Runing from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

    public static void main(String[] args) {
        TommyVecetti player = new TommyVecetti();
        player.fire();
        player.hit();
        player.run();;
    }
}
