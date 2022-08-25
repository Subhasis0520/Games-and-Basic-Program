package com.company;


    class Employee1{
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("My id is " + id);
            System.out.println("and my name is "+ name);
        }

        public int getSalary(){
            return salary;
        }
    }

public class Custom_Method {
        public static void main(String[] args) {
            System.out.println("This is our custom class");
            Employee1 ram = new Employee1(); // Instantiating a new Employee Object
            Employee1 john = new Employee1(); // Instantiating a new Employee Object

            // Setting Attributes for Harry
            ram.id = 12;
           ram.salary = 34;
            ram.name = "Ram Potani";

            // Setting Attributes for John
            john.id = 17;
            john.salary = 12;
            john.name = "John Khandelwal";

            // Printing the Attributes
            ram.printDetails();
            john.printDetails();
            int salary = john.getSalary();
            System.out.println("and my salary is " + salary);

        }
    }


