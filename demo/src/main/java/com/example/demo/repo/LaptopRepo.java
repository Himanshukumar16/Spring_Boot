package com.example.demo.repo;
import com.example.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {

    public void save(Laptop lap) {
        System.out.println("It is saved !");
    }
}
