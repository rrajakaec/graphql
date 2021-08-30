package com.demo.graphql.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String title;

	private String isbn;

	private int pageCount;

	@ManyToOne
	@JoinColumn(name = "author_id", nullable = false, updatable = false)
	private Author author;

	public Book(String title, String isbn, int pageCount, Author author) {
		this.title = title;
		this.isbn = isbn;
		this.pageCount = pageCount;
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(obj, this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
