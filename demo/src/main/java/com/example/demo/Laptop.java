package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("compiling in laptop !");
    }
}
