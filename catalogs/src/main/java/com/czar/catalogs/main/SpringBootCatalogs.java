package com.czar.catalogs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.czar.catalogs"})
public class SpringBootCatalogs {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCatalogs.class, args);
	}
}
