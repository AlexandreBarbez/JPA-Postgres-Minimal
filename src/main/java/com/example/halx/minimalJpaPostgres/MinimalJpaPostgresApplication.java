package com.example.halx.minimalJpaPostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MinimalJpaPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimalJpaPostgresApplication.class, args);
	}
}
