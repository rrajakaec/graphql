package com.demo.graphql.resolver;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphql.model.Author;
import com.demo.graphql.model.Book;
import com.demo.graphql.repositories.AuthorRepository;
import com.demo.graphql.repositories.BookRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Resource
	private BookRepository bookRepository;

	@Resource
	private AuthorRepository authorRepository;

	public List<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public Long countAuthors() {
		return authorRepository.count();
	}

	public Author findAuthorById(Long id) {
		return authorRepository.findById(id).orElse(null);
	}

	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	public Long countBooks() {
		return bookRepository.count();
	}

	public Book findBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

}
