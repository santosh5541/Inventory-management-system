package com.inventory;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class InventoryBackendApplication  {


	public static void main(String[] args) {
		SpringApplication.run(InventoryBackendApplication.class, args);
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
