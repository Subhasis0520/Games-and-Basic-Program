package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor<computerInput> {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor");
        Scanner sc = new Scanner(System.in);
        int userInput =sc.nextInt();

        Random n = new Random();
        int computerInput = n.nextInt(3);
        if(userInput == computerInput){
            System.out.println("Draw");
        }
else if((userInput==0 && computerInput == 2) ||(userInput==1 && computerInput == 0) || (userInput==2 && computerInput == 0)){
            System.out.println("You win");
        }
else{
            System.out.println("Computer win");
        }

if(computerInput == 0){
    System.out.println("Computer choose rock");
}

else if(computerInput ==1){
        System.out.println("Computer choose paper");
    }
 else if (computerInput == 2) {
    System.out.println("Computer choose scissor");
}

    }


}
