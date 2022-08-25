package com.company;

    class Employee3 {
        // First constructor
        Employee3(String s, int i){
            System.out.println("The name of the first employee is : " + s);
            System.out.println("The id of the first employee is : " + i);
        }
        //    Constructor overloaded
        Employee3(String s, int i, int salary){
            System.out.println("The name of the second employee is : " + s);
            System.out.println("The id of the second employee is : " + i);
            System.out.println("The salary of second employee is : " + salary);
        }

    }
public class Constructor_Overloading {
        public static void main(String[] args) {
            Employee3 subha = new Employee3("Subha",1);
            Employee3 soyma = new Employee3("Soyma",2,70000);



        }
    }


