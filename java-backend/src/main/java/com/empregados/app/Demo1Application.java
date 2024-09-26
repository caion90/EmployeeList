package com.empregados.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empregados.app.entity.PostEntity;
import com.empregados.app.repository.PostRepository;
import com.empregados.app.service.PostService;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@PostConstruct
	public static void construct() {
	
		PostRepository repo;

		PostEntity repo1 = new PostEntity();
		repo1.setEmail("caio@gmail.com");
		repo1.setId(1);
		repo1.setId_usuario(1);
		repo1.setPost("teste");
		repo1.setTelefone(17996819031);
		repo1.setUsuario("caio");

		repo.addRepo(repo1);

		PostEntity repo2 = new PostEntity();
		repo2.setEmail("fulano@gmail.com");
		repo2.setId(2);
		repo2.setId_usuario(2);
		repo2.setPost("post test 2");
		repo2.setTelefone(17912371289);
		repo2.setUsuario("fulano");

		repo.addRepo(repo2);

		PostEntity repo3 = new PostEntity();
		repo3.setEmail("beltrano@hotmail.com");
		repo3.setId(3);
		repo3.setId_usuario(3);
		repo3.setPost("vende-se sorvete");
		repo3.setTelefone(1728724233);
		repo3.setUsuario("beltrano");

		repo.addRepo(repo3);

		PostEntity repo4 = new PostEntity();
		repo4.setEmail("ciclano@terra.com.br");
		repo4.setId(4);
		repo4.setId_usuario(4);
		repo4.setPost("vende-se barco de pesca");
		repo4.setTelefone(1718581423);
		repo4.setUsuario("ciclano");

		repo.addRepo(repo4);
	}



}
