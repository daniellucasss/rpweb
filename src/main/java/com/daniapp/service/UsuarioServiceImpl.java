package com.daniapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniapp.model.Usuario;
import com.daniapp.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@Override
	public void persist(Usuario usuario) {
		repository.persist(usuario);
	}

}
