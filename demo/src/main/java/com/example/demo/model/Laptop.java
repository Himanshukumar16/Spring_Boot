package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("compiling in laptop !");
    }
}
