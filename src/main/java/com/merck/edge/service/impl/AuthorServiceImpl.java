package com.merck.edge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.query.CassandraPageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import com.merck.edge.dao.repo.IAuthorRepository;
import com.merck.edge.model.Author;
import com.merck.edge.service.IAuthorService;


@Service
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	IAuthorRepository dao;
	
	@Override
	public List<Author> findAll(int pageNum) {
		
		 Slice<Author> page =  dao.findAll(CassandraPageRequest.of(0, 100));
		 int count = 0;
		 while(page.hasNext()) {
			 if(count == pageNum) {
				 System.err.println("count => "+ count + "page =>" + pageNum);
				 return dao.findAll(page.nextPageable()).getContent();
			 }
			 ++count;
		}
		return page.getContent();
	}
	

	@Override
	public List<Author> findAll() {
		return dao.findAll();
	}
	 
}
