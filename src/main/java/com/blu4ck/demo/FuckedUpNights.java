package com.blu4ck.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;

@SpringBootApplication
public class FuckedUpNights {

	public static void main(String[] args) {
		SpringApplication.run(FuckedUpNights.class, args);
	}
}