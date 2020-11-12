package com.rcb.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LibraryController {

	@Autowired 
	public LibraryService lservice;
	
	@RequestMapping(value="/books", method = RequestMethod.POST)
	public ResponseEntity<String> createBook(@RequestBody Library lib){
		return new ResponseEntity<String>(lservice.addBook(lib), HttpStatus.OK);
	}

	@RequestMapping(value="/books", method = RequestMethod.GET)
	public ResponseEntity<List<Library>> getBook(){
		return new ResponseEntity<List<Library>>(lservice.getBook(), HttpStatus.OK);
	}

	@RequestMapping(value="/books/{book_id}", method = RequestMethod.GET)
	public ResponseEntity<Library> getBookById(@PathVariable("book_id") int id){
		return new ResponseEntity<Library>(lservice.getBookById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/books", method = RequestMethod.PUT)
	public ResponseEntity<String> updateBook(@RequestBody Library lib){
		return new ResponseEntity<String>(lservice.updateBook(lib), HttpStatus.OK);
	}
	
	@RequestMapping(value="/books/{book_id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteBook(@PathVariable("book_id") int id){
		return new ResponseEntity<String>(lservice.deleteBook(id),HttpStatus.OK);		
	}
}
