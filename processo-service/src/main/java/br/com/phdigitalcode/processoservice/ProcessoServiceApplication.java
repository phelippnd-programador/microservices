package br.com.phdigitalcode.processoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProcessoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessoServiceApplication.class, args);
	}

}
