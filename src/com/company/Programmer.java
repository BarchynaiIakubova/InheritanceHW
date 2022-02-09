package com.company;

public class Programmer extends Person {
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(String code) {
        System.out.println(code);
    }

    @Override
    public String toString() {
        return "Programmer's name is " + name + ", profession " + designation + ", he works at " + companyName + " company";
    }

}
