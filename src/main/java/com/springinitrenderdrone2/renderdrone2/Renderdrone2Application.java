package com.springinitrenderdrone2.renderdrone2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(ResultaatRequests.class)
public class Renderdrone2Application {

	public static void main(String[] args) {
		SpringApplication.run(Renderdrone2Application.class, args);
	}

}
