package com.daniapp.repository;

import java.util.List;

public interface GenericRepository<T extends Object>{

	T findById(Long id);
	
	List<T> findAll();
	
	void persist(T t);
	
}
