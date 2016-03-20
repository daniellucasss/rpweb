package com.daniapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daniapp.model.Usuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Usuario findById(Long id) {
		Query query = entityManager.createQuery("Select u from com.daniapp.model.Usuario u where u.id = :id");
		query.setParameter("id", id);
		return (Usuario) query.getSingleResult();
	}

	@Override
	public List<Usuario> findAll() {
		Query query = entityManager.createQuery("Select * from com.daniapp.model.Usuario");
		return (List<Usuario>) query.getResultList();
	}

	@Override
	public void persist(Usuario usuario) {
		entityManager.persist(usuario);
	}

}
