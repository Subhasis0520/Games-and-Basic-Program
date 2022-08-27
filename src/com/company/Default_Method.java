package com.company;

interface MyCamera{
    void takeSelfie();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling to "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... to a person ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSelfie(){
        System.out.println("Taking selfie with friends");
    }
    public void recordVideo(){
        System.out.println("Recording a video");
    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Airtel", "Jio", "VI5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Default_Method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        ms.callNumber(859748);
        ms.takeSelfie();
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}




