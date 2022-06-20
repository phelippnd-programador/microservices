package br.com.phdigitalcode.analiseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnaliseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnaliseServiceApplication.class, args);
	}

}
