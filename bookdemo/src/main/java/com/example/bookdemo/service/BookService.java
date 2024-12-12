package com.example.bookdemo.service;

import com.example.bookdemo.model.Book;
import com.example.bookdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

  private final BookRepository bookRepository;

  @Autowired
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  // Create or Update a book
  public Book createOrUpdateBook(Book book) {
    return bookRepository.save(book);
  }

  // Get all books
  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  // Get a book by ID
  public Optional<Book> getBookById(Long id) {
    return bookRepository.findById(id);
  }

  // Delete a book
  public boolean deleteBook(Long id) {
    if (bookRepository.existsById(id)) {
      bookRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
