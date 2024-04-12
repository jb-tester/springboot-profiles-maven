package com.example.springbootprofilesmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringbootProfilesMavenApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootProfilesMavenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MyConfProp props = ctx.getBean(MyConfProp.class);
        System.out.println("**********************************");
        System.out.println(props.getProp1());
        System.out.println(props.getProp2());
        System.out.println("**********************************");
    }

    
}
