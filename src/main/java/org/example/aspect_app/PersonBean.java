package org.example.aspect_app;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PersonBean {

    public int greet() {
        System.out.println("hello");
        return 0;
    }

    public void greetInFrench() {
        System.out.println("Bonjour");
    }
}
