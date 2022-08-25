package com.company;

public class Method_Overloading {

        static void foo(){
            System.out.println("Good Morning bro!");
        }

        static void foo(int a){
            System.out.println("Good morning " + a + " bro!");
        }

        static void foo(int a, int b){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void foo(int a, int b, int c){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
            System.out.println("Good morning " + c + " bro!");
        }


        static void tellJoke(){
            System.out.println("I invented a new word!\n" +
                    "Plagiarism!");
        }

        public static void main(String[] args) {
             tellJoke();



            // Method Overloading
            foo();
            foo(3000);
            foo(3000, 4000);
            foo(10,40,60);
            // Arguments are actual!


        }
    }


