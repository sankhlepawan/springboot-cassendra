package com.merck.edge.dao.repo;



import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.merck.edge.model.Author;

@Repository
public interface IAuthorRepository extends CassandraRepository<Author, String> {
	
	@Query("select * from edge_author")
    List<Author> findAll();
	
}

