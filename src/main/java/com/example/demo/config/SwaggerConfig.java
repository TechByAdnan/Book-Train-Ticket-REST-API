package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI apiInfo() {
		return new OpenAPI()
				.info(new Info()
				.title("Railway Reservation System REST API")
				.description("REST API docomentation for Railway Reservation System")
				.version("1.0")
				.contact(new Contact()
	                    .name("Mohd Adnan")
	                    .email("railholics606@gmail.com")
	                    .url("https://localhost:8080/Swagger-ui.html")));
				
		
	}

}
