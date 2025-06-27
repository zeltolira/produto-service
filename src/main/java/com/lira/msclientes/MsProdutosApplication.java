package com.lira.msclientes;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "produtos")
@Log4j2
public class MsProdutosApplication {

	@GetMapping
	public String GetHomeTest(){
		log.info("Obtendo s status do microsservice de produtos");
		return "Minha Loja Virtual.com - Microsservice!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MsProdutosApplication.class, args);
	}

}
