package com.covid19logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication(scanBasePackages = {"com.covid19logger","com.covid19logger.Controller","com.covid19logger.Dao","com.covid19logger.model","com.covid19logger.Service"})
public class Covid19loggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19loggerApplication.class, args);
	}

}
