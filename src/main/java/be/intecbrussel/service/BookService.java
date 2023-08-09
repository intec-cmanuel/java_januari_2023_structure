package be.intecbrussel.service;

import be.intecbrussel.model.Book;
import be.intecbrussel.repository.BookRepository;

import java.util.Optional;

public class BookService {
    private BookRepository bookRepository = new BookRepository();

    public boolean addBook(String title, String author) {
        Book book = new Book(title, author);
        return bookRepository.addBook(book);
    }

    public boolean removeBook(String title) {
        Optional<Book> book = bookRepository.readBook(title);

        if (book.isPresent()) {
            return bookRepository.removeBook(book.get());
        }

        return false;
    }
}
