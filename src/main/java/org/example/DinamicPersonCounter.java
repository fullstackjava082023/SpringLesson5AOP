package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DinamicPersonCounter implements InvocationHandler {

    private int counter = 0;
    private Person person;

    private DinamicPersonCounter(Person person) {
        this.person = person;
    }

    //factory method to create a proxy
    public static Object createDinamicPersonProxy(Person person) {
        return Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new DinamicPersonCounter(person));
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling greet number: " + ++counter);
        //to call to the method
        return method.invoke(person, args);
    }
}
