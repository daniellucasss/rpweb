package com.daniapp.service;

import java.util.List;

public interface GenericService<T extends Object> {

	T findById(Long id);
	
	List<T> findAll();
	
	void persist(T t);
	
}
