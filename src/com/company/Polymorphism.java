package com.company;

interface MyCamera2{
    void takeSelfie();

    private void greet(){
        System.out.println("Good Morning");
    }
    default void recordVideo(){
        greet();
        System.out.println("Recording video...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(long phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSelfie(){
        System.out.println("Taking selfie");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public void sampleMeth(){
        System.out.println("I am just a sample");
    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Airtel", "Bsnl", "Jio5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();
        cam1.recordVideo();

        MySmartPhone2 s = new MySmartPhone2();

        s.sampleMeth();
        s.getNetworks();
        s.callNumber(859748);
    }
}





