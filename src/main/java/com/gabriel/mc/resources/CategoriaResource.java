package com.gabriel.mc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.mc.domain.Categoria;
import com.gabriel.mc.services.CategoriaService;

//controlador rest
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//acessando o serviço
	@Autowired
	private CategoriaService service;
	
	//faz a busca
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		//response entity retorna o ok e retorna o objeto categoria buscado
		return ResponseEntity.ok().body(obj);
		
		}
}
