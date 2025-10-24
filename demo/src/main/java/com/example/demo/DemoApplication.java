package com.example.demo;

import com.example.demo.model.Laptop;
import com.example.demo.repo.LaptopRepo;
import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Laptop lap = context.getBean(Laptop.class);
		LaptopService lapSer = context.getBean(LaptopService.class);
		lapSer.addLaptop(lap);

//		Alien al = context.getBean(Alien.class);
//		System.out.println(al.getAge());
//		al.code();
	}

}
