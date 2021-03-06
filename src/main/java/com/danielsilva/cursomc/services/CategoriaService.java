package com.danielsilva.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielsilva.cursomc.domain.Categoria;
import com.danielsilva.cursomc.repositories.CategoriaRepository;
import com.danielsilva.cursomc.services.exception.ObjectNotFoundExecption;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExecption(
		"Objeto não encontrado! Id:" + id + ", Tipo: "
		 + Categoria.class.getName()));
	}

}
