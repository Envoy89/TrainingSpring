package spring.training.SimpleApiWithHibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.training.SimpleApiWithHibernate.entity.Book;
import spring.training.SimpleApiWithHibernate.service.BookService;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PostMapping("/createBooks")
    public List<Book> createBooks(@RequestBody List<Book> books) {
        return bookService.saveBooks(books);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/getBooksByAuthor/{name}")
    public List<Book> getBooksByAuthor(@PathVariable String name) {
        return bookService.getBooksByAuthor(name);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
}
