package com.sudo.mavenexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sudo.*" })
public class MavenExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenExampleApplication.class, args);
	}

}
