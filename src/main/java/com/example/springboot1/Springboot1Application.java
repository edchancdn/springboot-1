package com.example.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot1Application {

    private Car car;

    public Springboot1Application(Car car) {
        this.car = car;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Springboot1Application.class, args);
        System.out.println(context.getBean("car", Car.class));
    }

}
