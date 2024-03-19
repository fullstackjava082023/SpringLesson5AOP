package org.example;

public class Main {
    public static void main(String[] args) {

//        IPerson person = new PersonCounter();
        IPerson person = (IPerson) DinamicPersonCounter.createDinamicPersonProxy(new Person());
        person.greet();
        person.greet();
        person.greetInSpanish();
        person.greetInFrench();
        person.greet();
        person.greetInFrench();
        person.greetInSpanish();
    }
}