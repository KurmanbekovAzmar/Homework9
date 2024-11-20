package service.serviceImpl;

import dataBase.DataBase;
import models.Book;
import models.Library;
import service.BookService;
import service.LibraryService;

import java.util.ArrayList;

public class BookServiceImpl implements BookService {
    @Override
    public Book saveBook(Long libraryId, Book book) {
        for(Library library: DataBase.libraries){
            if(library.getId()==libraryId){
                library.getBooks().add(book);
                System.out.println("Success!!!");
                break;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return DataBase.books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for(Library library: DataBase.libraries){
            if(library.getId()==libraryId){
                for(Book book:DataBase.books){
                    if(book.getId()==bookId){
                        return book;

                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for(Library library: DataBase.libraries){
            if(library.getId()==libraryId){
                for(Book book:DataBase.books){
                    if(book.getId()==bookId){
                        DataBase.books.remove(book);

                    }
                }
            }
        }
        return "";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for(Library library: DataBase.libraries){
            if(library.getId()==libraryId){
                library.getBooks().remove(library.getBooks());
                break;
            }
        }
    }
}
