package spring.training.SimpleApiWithHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.training.SimpleApiWithHibernate.entity.Book;
import spring.training.SimpleApiWithHibernate.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "delete book with id: " + id;
    }

    public Book updateBook(Book book) {
        Book existingBook = bookRepository.findById(book.getId()).orElse(null);

        if (existingBook == null) {
            return null;
        }

        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());
        return bookRepository.save(existingBook);
    }
}
