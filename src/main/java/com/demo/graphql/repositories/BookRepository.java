package com.demo.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.graphql.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
