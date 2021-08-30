package com.demo.graphql.model;

import static javax.persistence.GenerationType.AUTO;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "author")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author {

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;

	private String firstName;

	private String lastName;

	public Author(Long id) {
		this.id = id;
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
