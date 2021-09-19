package spring.training.SimpleApiWithHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.training.SimpleApiWithHibernate.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByAuthor(String name);
}
