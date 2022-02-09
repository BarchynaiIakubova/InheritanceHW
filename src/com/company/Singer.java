package com.company;

public class Singer extends Person {
    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name,designation);
        this.bandName = bandName;
    }
    @Override
    public String toString() {
        return "Singer's name is " + name + ", profession " + designation + ", group's name is " + bandName;
    }

    public void playGuitar() {
        System.out.println("playing guitar");
    }
    public void singing() {
        System.out.println("A singer is singing a song");
    }
}
