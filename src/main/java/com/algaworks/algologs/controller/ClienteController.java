package com.algaworks.algologs.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algologs.model.Cliente;

@RestController /*Rest*/
//Fazendo teste com postman 
public class ClienteController {
	
	@PersistenceContext
	private EntityManager manager;

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return manager.createNamedQuery("FROM Cliente", Cliente.class) //consulta jpql | result classe tipagem para retonar cliente 
				.getResultList(); //retorna uma lista via get
				
		}
}
