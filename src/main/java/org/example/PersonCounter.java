package org.example;

public class PersonCounter{

    private Person person = new Person();
    private int counter = 0;


    public void greet() {
        System.out.println("Calling greet number: " + ++counter);
        person.greet();
    }

    public void greetInFrench() {
        System.out.println("Calling greet number: " + ++counter);
        person.greetInFrench();
    }
}
