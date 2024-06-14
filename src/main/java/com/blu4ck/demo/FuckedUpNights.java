package com.blu4ck.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class FuckedUpNights {
	private final static Logger log = LoggerFactory.getLogger(FuckedUpNights.class);

	public static void main(String[] args) {
		SpringApplication.run(FuckedUpNights.class, args);
		log.info("Something changed!");



	}
}