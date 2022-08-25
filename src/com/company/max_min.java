package com.company;

public class max_min {
    public static void main(String[] args) {
        int []a = new int[]{10,60,50,40,30};
        int max = 0;
        for(int i =0; i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int min = a[0];
        for(int i =0; i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("maximum value of the array is :"+ max);
        System.out.println("minimum value of the array is :" + min);
    }
}
