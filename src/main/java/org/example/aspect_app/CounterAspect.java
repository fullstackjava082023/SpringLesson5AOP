package org.example.aspect_app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CounterAspect {

    private int counter = 0;

//    @Before("execution(* *(..))")
//    public void addCounterToMethod() {
//        System.out.println("Added counter " + ++counter);
//    }

    @Before("execution(* PersonBean.greet(..)) ")
    public void addCounter() throws Exception {
        if (counter > 1) {
            throw new Exception("counter too big");
        }
        System.out.println("Added counter after " + ++counter);
    }



}
