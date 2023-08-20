package com.educandido.springinjecaodinamica;

import com.educandido.springinjecaodinamica.services.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringInjecaoDinamicaApplication {

	@Bean
	public CommandLineRunner executar(@Autowired CurriculoService curriculoService){
		return args -> {
			System.out.println(curriculoService.getCurriculo("WORD"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringInjecaoDinamicaApplication.class, args);
	}

}
