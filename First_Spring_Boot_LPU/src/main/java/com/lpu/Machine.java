package com.lpu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"myPack"})
public class Machine {
	@Bean("first")
	public Cutter getCutter() {
		System.out.println("I am first Bean");
		return new Cutter();
	}
	
	@Bean("second")
	@Lazy
	public Cutter useCutter() {
		System.out.println("I am Second Bean");
		return new Cutter();
	}

}
