package com.demo.graphql.resolver;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demo.graphql.model.Author;
import com.demo.graphql.model.Book;
import com.demo.graphql.repositories.AuthorRepository;

@Component
public class BookResolver implements GraphQLResolver<Book> {

	@Resource
	private AuthorRepository authorRepository;

	public Author getAuthor(Book book) {
		return authorRepository.findById(book.getAuthor().getId())
				.orElse(null);
	}

}
