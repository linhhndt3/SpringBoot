package edu.hanoi.springclazz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan({"edu.hanoi.controller","edu.java.web.config"})
@ImportResource("classpath:config.xml")
public class SpringClazzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClazzApplication.class, args);
	}
}
