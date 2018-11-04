package com.muru.learn.mathapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class SpringMathappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMathappApplication.class, args);
        System.out.println("First Spring app");

    }
}
