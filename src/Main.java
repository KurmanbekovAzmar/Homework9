import dataBase.DataBase;
import enums.Gender;
import enums.Genre;
import models.Book;
import models.Library;
import models.Reader;
import service.BookService;
import service.LibraryService;
import service.ReaderService;
import service.serviceImpl.BookServiceImpl;
import service.serviceImpl.LibraryServiceImpl;
import service.serviceImpl.ReaderServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        BookService bookService = new BookServiceImpl();
        LibraryService libraryService =  new LibraryServiceImpl();
        ReaderService readerService = new ReaderServiceImpl();

        Book book1 = new Book(1L,"kjhdjh","Azmar", Genre.Fantasy);
        Book book2 = new Book(2L,"s;lkkjsllds","Sangar",Genre.Horror);
        Reader reader1 = new Reader(1L,"Azmar","azmar@gmail.com","707 64 17 82", Gender.Male);
        Reader reader2 = new Reader(2L,"Gulnur eje","gulnur@gmail.com","707 64 17 81", Gender.Female);

        Library library = new Library(1L,"Library","Grajdanskaya 119",DataBase.books,DataBase.readers);
        libraryService.saveLibrary(library);
        System.out.println("Add book for Library: ");
        bookService.saveBook(1L,book1);
        bookService.saveBook(1L,book2);
        System.out.println("get all books:");
        System.out.println(bookService.getAllBooks());
        System.out.println("Get book by id: ");
        System.out.println(bookService.getBookById(1L,1L));
        System.out.println("Save reader : ");
        readerService.saveReader(reader1);
        System.out.println("Get reader by id: ");
        System.out.println(readerService.getReaderById(1L));
//        System.out.println("Update reader: ");
//        readerService.updateReader(1L,reader1);
//        System.out.println("assing reader to library: ");
//        readerService.assignReaderToLibrary(1L,1L);
        System.out.println("Get all library: ");
        System.out.println(libraryService.getAllLibraries());
        System.out.println("Delete library: ");
        libraryService.deleteLibrary(1L);
        System.out.println("Get all library: ");
        System.out.println(libraryService.getAllLibraries());


    }
}