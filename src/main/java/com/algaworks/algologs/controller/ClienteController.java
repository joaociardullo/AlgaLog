package com.algaworks.algologs.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algologs.model.Cliente;

@RestController
//Fazendo teste com postman 
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		//criando dois clientes para teste do postman
		cliente1.setId(1l);
		cliente1.setNome("Joao");
		cliente1.setTelefone("11985640");
		cliente1.setEmail("joao@hotmail.com");
		
		
		
	var cliente2 = new Cliente();
		
		cliente1.setId(2l);
		cliente1.setNome("maria");
		cliente1.setTelefone("11985640");
		cliente1.setEmail("maria@hotmail.com");
		
		
		
		
		return Arrays.asList(cliente1,cliente2);
	}
}
