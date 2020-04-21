package com.algaworks.osworks.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.models.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Joao das Covas");
		cliente1.setTelefone("11 7777-44444");
		cliente1.setEmail("joaodascovas@algaworks.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("67 8888-44444");
		cliente2.setEmail("maria@algaworks.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
