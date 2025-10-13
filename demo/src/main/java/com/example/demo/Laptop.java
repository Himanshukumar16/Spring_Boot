package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("compiling in laptop !");
    }
}
