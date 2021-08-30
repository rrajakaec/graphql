package com.demo.graphql.resolver;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphql.model.Author;
import com.demo.graphql.model.Book;
import com.demo.graphql.repositories.AuthorRepository;
import com.demo.graphql.repositories.BookRepository;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Resource
	private BookRepository bookRepository;

	@Resource
	private AuthorRepository authorRepository;

	public Author newAuthor(String firstName, String lastName) {
		final Author author = new Author(firstName, lastName);
		return authorRepository.save(author);
	}

	public Book newBook(String title, String isbn, int pageCount, long authorId) {
		final Book book = new Book(title, isbn, pageCount, new Author(authorId));
		return bookRepository.save(book);
	}

	public boolean deleteBook(Long id) {
		bookRepository.deleteById(id);
		return true;
	}

	public Book updateBookPageCount(Integer pageCount, Long id) {
		final Book book = bookRepository.findById(id).get();
		book.setPageCount(pageCount);

		return bookRepository.save(book);
	}

}
