package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer programmer = new Programmer("Olga","Programmer","Microsoft");
	Dancer dancer = new Dancer("Ana","Dancer","Umai dance");
	Singer singer = new Singer("Andrea","singer","Own group");
	dancer.eat("A dancer is eating");
	singer.singing();
	String a = programmer.walk("A programmer is walking");
        System.out.println(a);

        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);

    }
}
