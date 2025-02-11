package com.lpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myPACK.Cricketer;

@SpringBootApplication
public class FirstSpringBootLpuApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("first")
	Cutter c;
	
	@Autowired
	Player p;
	
	@Autowired
	Circle c1;
	
	@Autowired
	Cricketer ck;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootLpuApplication.class, args);
		
		System.out.println("This is my first output on console!!");
		System.out.println("Angular is the best fw ever");
	}
	@Override
	public void run(String... args)throws Exception{
		this.c.cutting();
		this.p.display();
		this.c1.setRadius(3);
		this.ck.getCrickInfo();
	}
}


 