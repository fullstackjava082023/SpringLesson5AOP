package org.example.aspect_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspects {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonBean personBean = applicationContext.getBean(PersonBean.class);
        personBean.greet();
        personBean.greet();
        personBean.greetInFrench();
        personBean.greet();
    }
}
