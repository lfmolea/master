package com.bookPotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


 @ComponentScan(basePackages={ ("com.adminPotal."), ("com.adminPotal.service.") })
  
  @EnableJpaRepositories("com.adminPotal.repository")
  
  @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
 
@SpringBootApplication
public class BookPotalApplication {
	
	public static void main(String[] args) {		
		 /* Responsible for launching the boot application. */
		SpringApplication.run(BookPotalApplication.class, args);
		
	     
	}	

}
