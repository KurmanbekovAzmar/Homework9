package service;

import models.Book;

import java.util.ArrayList;

public interface BookService {
    Book saveBook(Long libraryId, Book book);

    ArrayList<Book> getAllBooks();

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);
}
