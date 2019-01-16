package com.gabriel.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.mc.domain.Categoria;
import com.gabriel.mc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//serviço acessando objeto de acesso a dados (repository)
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
