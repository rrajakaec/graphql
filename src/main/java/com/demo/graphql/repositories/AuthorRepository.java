package com.demo.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.graphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
