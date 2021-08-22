package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Book")
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;

}
