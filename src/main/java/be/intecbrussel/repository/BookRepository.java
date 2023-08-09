package be.intecbrussel.repository;

import be.intecbrussel.model.Book;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        }

        return false;
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public Optional<Book> readBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }

        return Optional.empty();
    }
}















