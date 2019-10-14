package com.merck.edge.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merck.edge.model.Author;
import com.merck.edge.service.IAuthorService;

@RestController
@CrossOrigin("*")
@RequestMapping(value={"/app"})
public class AppController {
	
	private final Logger LOGGER  = Logger.getLogger(this.getClass());
	
	@Autowired
	IAuthorService service;
	
	@GetMapping(value="/v1/findAll/{pageNum}")
	public List<Author> login(@PathVariable("pageNum") int pageNum) {
		return service.findAll(pageNum);
    }
	
	

}
