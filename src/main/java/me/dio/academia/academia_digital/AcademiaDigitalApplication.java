package me.dio.academia.academia_digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class AcademiaDigitalApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcademiaDigitalApplication.class, args);
	}
}
