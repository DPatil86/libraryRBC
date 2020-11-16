package com.rcb.library;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryService {

	public static void main(String[] args) {
		SpringApplication.run(LibraryService.class, args);
	}
	
	@Autowired
	private LibraryRepository l;
	
	public String addBook(Library lib) {
		Library x = l.save(lib);
		if(x != null)
		{
			return "Book with id: "+  x.getBook_id() + " is added successfully";
		}
		return null;
	}

	public List<Library> getBook() {
		return (ArrayList<Library>) l.findAll();
	}

	public Library getBookById(int id) {
		return l.findById(id).get();
	}

	public String updateBook(Library lib) {
		Library x = l.save(lib);
		if(x != null)
		{
			return "Book with id: "+  x.getBook_id() + " updated successfully";
		}
		else {
			return "Book updation failed for id";
		}
	}

	public String deleteBook(int id) {
		l.deleteById(id);
		return "Product deleted with id: "+id;
	}
}
