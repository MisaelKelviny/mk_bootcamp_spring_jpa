package me.dio.academia.academia_digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = { WebMvcAutoConfiguration.class })
public class AcademiaDigitalApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcademiaDigitalApplication.class, args);
	}
}
