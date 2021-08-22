package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.repository.*;
import com.example.model.*;
import java.util.List;
import lombok.SneakyThrows;




@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringbootAwsRdsApplication {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@GetMapping
	public List<Book> findBooks() {
		return bookRepository.findAll();
	}

	@SneakyThrows
	@GetMapping("/{id}")
	public Book findBook(@PathVariable int id) {
		return bookRepository.findById(id).orElseThrow(() -> new Exception("Book not available"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsRdsApplication.class, args);
	}

}
