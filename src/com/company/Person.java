package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Person is learning");
    }
    public void eat(String a) {
        System.out.println(a);
    }
    public String walk(String b) {
        return b;
    }

}
