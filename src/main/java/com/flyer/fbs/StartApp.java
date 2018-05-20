package com.flyer.fbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FbsApplication.class, args);
	}

}
