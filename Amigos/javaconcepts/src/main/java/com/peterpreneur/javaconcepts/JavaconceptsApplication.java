package com.peterpreneur.javaconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaconceptsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JavaconceptsApplication.class, args);
		System.out.println("Bean Count:" + context.getBeanDefinitionCount());
	}

}
