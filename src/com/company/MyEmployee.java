package com.company;

public class MyEmployee {
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        MyEmployee raj = new MyEmployee();
        raj.setName("Raj Ghosh");
        raj.setId(20);
        System.out.println(raj.getName());
        System.out.println(raj.getId());
    }
}
