package com.merck.edge.generic;

import java.util.List;

public interface IGenericDao<T>{
	
	 Long count();

	 void deleteById(Long id);

	 T findById(Long id);

	 T save(T entity);
	 
	 List<T> findAll();
	 
}
