package com.pinanims.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pinanims.mvc.models.Book;

@Repository
public interface BookRepositories extends CrudRepository<Book, Long> {
	List<Book> findAll(); //This will return all of the books.
	List<Book> findByDescriptionContaining(String search); //Find a book by their description.
//	Long countByTitleContaining(String search);
//	Long deleteByTitleStartingWith(String search);
}
 