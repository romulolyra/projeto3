package com.paco.pop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class PopApplication {
	public static void main(String[] args) {
		SpringApplication.run(PopApplication.class, args);
	}
}
