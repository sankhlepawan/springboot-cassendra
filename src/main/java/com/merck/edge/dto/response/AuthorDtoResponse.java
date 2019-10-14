package com.merck.edge.dto.response;

import java.util.List;

import com.merck.edge.model.Author;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class AuthorDtoResponse {

	private List<Author> authors;
	
}
