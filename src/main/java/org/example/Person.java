package org.example;

public class Person implements IPerson{
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    @Override
    public void greetInFrench() {
        System.out.println("Bonjour");
    }

    @Override
    public void greetInSpanish() {
        System.out.println("Hola");
    }


}
