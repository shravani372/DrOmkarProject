package com.patient.management.system;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("STARTED");

	}

}
