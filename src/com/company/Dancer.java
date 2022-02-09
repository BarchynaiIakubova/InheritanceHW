package com.company;

public class Dancer extends Person {
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer's name is " + name + ", profession " + designation + ", group's name is " + groupName;
    }

    public void dancing() {
        System.out.println("A person is dancing");
    }
}
