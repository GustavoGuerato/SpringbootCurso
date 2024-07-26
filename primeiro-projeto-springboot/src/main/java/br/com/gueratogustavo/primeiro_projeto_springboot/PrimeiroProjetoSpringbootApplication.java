package br.com.gueratogustavo.primeiro_projeto_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.gueratogustavo")
public class PrimeiroProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
	}

}
