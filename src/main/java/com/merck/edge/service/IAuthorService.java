package com.merck.edge.service;

import java.util.List;

import com.merck.edge.model.Author;

public interface IAuthorService {

	List<Author> findAll();

	List<Author> findAll(int pageNum);
}
