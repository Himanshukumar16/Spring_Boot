package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo repo;

    public void addLaptop(Laptop lap) {
        System.out.println("Laptop information is taken !");
        repo.save(lap);
    }

    public boolean isGoodForCode(Laptop lap) {
        return true;
    }
}
